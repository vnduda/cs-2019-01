const crivoEratostenes = require("../crivoEratostenes.js");

test("Caso classico", () => {
    expect(crivoEratostenes([0, 0, 0, 0, 0, 0], 6)).toEqual([0, 0, 0, 0, 1, 0, 1]);
});

test("argumento null/undefined", () => {
    expect(() => { crivoEratostenes(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { crivoEratostenes("000000", 6); }).toThrow(TypeError);
});

test("Vetor não está zerado", () => {
    expect(() => { crivoEratostenes([0, 2, 1, -1, 0, 0], 6); }).toThrow(RangeError);
});