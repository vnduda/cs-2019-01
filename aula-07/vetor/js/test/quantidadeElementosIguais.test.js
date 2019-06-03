const quantidadeElementosIguais = require("../quantidadeElementosIguais.js");

test("Caso classico", () => {
    expect(quantidadeElementosIguais([1, 0, 15.5])).toBe(0);
});

test("argumento não é vetor", () => {
    expect(() => { quantidadeElementosIguais("abc"); }).toThrow(TypeError);
});