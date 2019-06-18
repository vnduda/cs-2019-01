const caractereMaisFrequente = require("../caractereMaisFrequente.js");

test("Caso classico", () => {
    expect(caractereMaisFrequente("ola", ["ola", "tudo", "bem", "ola"])).toBe(2);
});

test("argumento não é vetor", () => {
    expect(() => { caractereMaisFrequente("ola", ["ola", "bem", 0]); }).toThrow(TypeError);
});