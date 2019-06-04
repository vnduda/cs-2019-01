const caractereMaisFrequente = require("../caractereMaisFrequente.js");

test("Caso classico", () => {
    expect(caractereMaisFrequente("Ola mundo!")).toBe(8);
});

test("argumento não é vetor", () => {
    expect(() => { caractereMaisFrequente("abc"); }).toThrow(TypeError);
});