        /**
         * Path para a requisição (URL)
         */
        const PATH = "http://localhost:1025/ds?inicio=";

        /**
         * Função que obtém a data inicial e final e retorna a diferença em
         * dias para essas datas.
         * Ela irá interagir com o servidor e exibir a diferença de dias na
         * interface html para o usuário.
         */
        function atualizaDiaDaSemana() {
            var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function () {
                if (this.readyState == 4 && this.status == 200) {
                    let dds = xhttp.responseText;
                    document.getElementById("resultado").innerHTML = 
                        `${dds} dia(s) de diferença entre as datas.`;
                }
            };

            let dataAnoMesDia = document.getElementById("dataInicial").value;
            let dataInicial = formataData(dataAnoMesDia);
            let dataAnoMesDia2 = document.getElementById("dataFinal").value;
            let dataFinal = formataData(dataAnoMesDia2);
            xhttp.open("GET", montaURL(dataInicial, dataFinal) , true);
            xhttp.send();
        }

        /**
         * Função que monta a URL concatenando o Path e a data inicial e final.
         * @param {String} dataInicial data inicial a ser inserida pelo usuário
         * @param {String} dataFinal data final a ser inserida pelo usuário
         * @returns url concatenada
         */
        function montaURL(dataInicial, dataFinal) {
            return PATH + dataInicial + '&final=' + dataFinal;
        }

        /**
         * Função que pega o elemento pelo id, ou seja, as datas inicial e
         * final e as aloca em Date.
         */
        function dataCorrente() {
            document.getElementById("dataInicial").valueAsDate = new Date();
            document.getElementById("dataFinal").valueAsDate = new Date();
        }

        /**
         * Função que formata um dia ou mês para possuir apenas dois dígitos.
         * @param {number} n dia ou ano a ser formatado
         * @returns dia ou mês formatado para possuir dois dígitos
         */
        function formataDiaOuMes(n) {
            return ("00" + n).substr(-2, 2);
        }

        /**
         * Função que formata ano para ter apenas 4 dígitos.
         * @param {number} n ano a ser formatado
         * @returns ano contendo 4 dígitos
         */
        function formataAno(n) {
            return ("0000" + n).substr(-4,4);
        }

        /**
         * Função que formata a data recebendo: ano-mes-dia
         * @param {String} data a ser formatada 
         * @returns a data formatada em: dd-mm-yyyy
         */
        function formataData(dataInicial) {
            let [a, m, d] = dataInicial.split("-");

            let dia = formataDiaOuMes(d);
            let mes = formataDiaOuMes(m);
            let ano = formataAno(a);

            return `${d}-${m}-${a}`;
        }
module.exports = index;