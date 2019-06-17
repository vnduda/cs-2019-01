const menorTemperatura = require("../menorTemperatura.js");

test("satisfaz (caso classico)", () => {
    expect(menorTemperatura([-55.5, -100, 0.8, 200])).toBe(-100);
});

test("argumento não é vetor", () => {
    expect(() => { menorTemperatura([10.2, "a", 0]); }).toThrow(TypeError);
});