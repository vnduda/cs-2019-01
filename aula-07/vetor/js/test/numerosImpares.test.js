const numerosImpares = require("../numerosImpares.js");

test("Caso classico", () => {
    expect(numerosImpares([1, 8, 7, 3, 11])).toBe(22);
});

test("argumento não é vetor", () => {
    expect(() => { numerosImpares([10.2, "b", 0]); }).toThrow(TypeError);
});