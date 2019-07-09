 // Path para a requisição (URL)
        const PATH = "http://localhost:9876/ds?inicio=";

        /**
         * Função que obtém a data inicial e final e retorna a diferença em dias para essas datas.
         * Ela irá interagir com o servidor e exibir a diferença de dias na interface html para o usuário.
         */
        function atualizaDiaDaSemana() {
            var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function () {
                if (this.readyState == 4 && this.status == 200) {
                    let dds = extraiDiaDaSemanaDaResposta(xhttp.responseText);
                    document.getElementById("resultado").innerHTML = `${dds} dia(s) de diferença entre as datas.`;
                }
            };

            let dataAnoMesDia = document.getElementById("dataInicial").value;
            let dataInicial = formataData(dataAnoMesDia);
            let dataAnoMesDia2 = document.getElementById("dataFinal").value;
            let dataFinal = formataData(dataAnoMesDia2);
            xhttp.open("GET", PATH + dataInicial + '&final=' + dataFinal, true);
            xhttp.send();
        }

        /**
         * Função que pega o elemento pelo id, ou seja, as datas inicial e final e as aloca em Date.
         */
        function dataCorrente() {
            document.getElementById("dataInicial").valueAsDate = new Date();
            document.getElementById("dataFinal").valueAsDate = new Date();
        }

        // Funções para integração (satisfazer contrato do servidor)

        function extraiDiaDaSemanaDaResposta(resposta) {
            return resposta;
        }

        // Dia ou mês deve possuir dois dígitos
        function formataDiaOuMes(n) {
            return ("00" + n).substr(-2, 2);
        }

        // Ano deve possuir quatro dígitos
        function formataAno(n) {
            return ("0000" + n).substr(-4,4);
        }

        // ENTRADA: ano-mes-dia SAIDA: dd-mm-yyyy
        function formataData(dataInicial) {
            let [a, m, d] = dataInicial.split("-");

            let dia = formataDiaOuMes(d);
            let mes = formataDiaOuMes(m);
            let ano = formataAno(a);

            return `${d}-${m}-${a}`;
        }