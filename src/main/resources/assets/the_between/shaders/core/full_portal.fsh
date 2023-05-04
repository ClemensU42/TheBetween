#version 150

#define PI 3.141592654

in vec2 texCoord0;

out vec4 fragColor;

uniform float GameTime;

const float pixelationFactor = 48.0 * 2;
const vec3 baseColor = vec3(0.0, 0.7, 0.3);
const vec2 resolution = vec2(48.0);

vec2 Rot(vec2 v, float angle){
    return vec2(v.x * cos(angle) + v.y * sin(angle),
                v.y * cos(angle) - v.x * sin(angle));
}

vec3 DrawStar(float len, float angle){
    float fre1 = 30.0;
    float fre2 = 20.0;
    float radius = 0.03;
    float m = radius / (radius + abs(sin(len * fre1 * 1.0 - 0.5 * GameTime * 10000.0)));
    float n = radius / (radius + abs(sin(angle * fre2 + len * 100.0)));
    float f6 = max(m * n - 0.1 * len, 0.0) * 100.0;
    return baseColor * f6;
}

float map(float l){
    float lm = 1.0;
    l = clamp(1e-1, l, l);
    float lm2 = lm * lm;
    float lm4 = lm2 * lm2;
    return sqrt(lm4 / (l * l) + lm2);
}

vec3 DrawCloud(float dis, float angle, vec2 coord){
    vec3 color = vec3(0.0);
    vec3 cloudColor = baseColor;
    float x = angle + dis;
    float fre = 2.0;
    float ap = 1.0;
    float d = float(0.0);
    coord = Rot(coord * max(dis, 1.0), dis);
    vec3 kp = vec3(coord * max(dis, 1.0), dis);
    for(int i = 1; i < 3; i++){
        float k = 1.0 + sin(fre * x + 0.3 * GameTime * 10000.0);
        k = k * k * 0.25;
        float p = fract(k + dis / float(i + 1));
        p = p * (1.0 - p);
        p = smoothstep(0.1, 0.25, p);
        d += ap * p;
        kp += sin(kp.zxy * 0.75 * fre + 0.3 * GameTime * 10000.0);
        d -= abs(dot(cos(kp), sin(kp.yzx)) * ap);
        fre *= -2.0;
        ap *= 0.5;
    }
    float len2 = dot(coord, coord);
    d += len2 * 4.0;
    return color + cloudColor * d;
}

vec3 Render(vec2 coord){
    float len = length(coord);
    float angle = PI - acos(coord.x / len) * sign(coord.y);

    vec3 color = vec3(0.0);
    float dis = map(len);
    color += DrawCloud(dis, angle, coord) * 0.3;
    vec3 fogColor = vec3(0.3, 1.5, 0.5);
    float fogC = pow(0.97, dis);
    color = mix(fogColor, color, fogC);
    return color;
}


void main(){
    vec2 uv = texCoord0 * pixelationFactor;
    uv = floor(uv) / pixelationFactor;
    vec2 coord = uv - 0.5;
    coord.y /= resolution.x / resolution.y;

    vec3 color = Render(coord);
    fragColor = vec4(color * 0.7, 1.0);
}