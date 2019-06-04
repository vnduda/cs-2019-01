const menorTemperatura = require("../menorTemperatura.js");

test("Caso classico", () => {
    expect(menorTemperatura([1, 2, 3, 4, 5, 6])).toBe(1);
});

test("argumento não é vetor", () => {
    expect(() => { menorTemperatura("abc"); }).toThrow(TypeError);
});