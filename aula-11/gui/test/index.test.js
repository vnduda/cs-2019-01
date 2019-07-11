const index = require("../index.js");

test("formata dia ou mês", () => {
    expect(formataDiaOuMes(24)).toBe("24");
});

test("formata ano", () => {
    expect(formataAno(1999)).toBe("1999")
});

test("formata data", () => {
    expect(formataDara("24061999")).toBe("24-06-1999")
});