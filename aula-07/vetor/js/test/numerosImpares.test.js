const numerosImpares = require("../numerosImpares.js");

test("Caso classico", () => {
    expect(numerosImpares([2, 8, 10, 6, 8, 22])).toBe(0);
});

test("argumento não é vetor", () => {
    expect(() => { numerosImpares("abc"); }).toThrow(TypeError);
});