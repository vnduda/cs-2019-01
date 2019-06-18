const palavraMaisFrequente = require("../palavraMaisFrequente.js");

test("Caso clássico", () => {
    expect(palavraMaisFrequente("oi oi como vai voce oi")).toBe("oi");
});

