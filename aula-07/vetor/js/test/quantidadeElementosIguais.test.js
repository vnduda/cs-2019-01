const quantidadeElementosIguais = require("../quantidadeElementosIguais.js");

test("Caso classico", () => {
    expect(quantidadeElementosIguais([1, 1, 7, 3, 11, 1], 1)).toBe(3);
});

test("argumento não é vetor", () => {
    expect(() => { quantidadeElementosIguais([10, "a", 0], 0); }).toThrow(TypeError);
});