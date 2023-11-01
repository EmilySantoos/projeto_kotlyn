fun main(args: Array<String>) {
    var nomes = arrayOf( "João Silva Pereira","Maria Santos Oliveira","Pedro Almeida Carvalho","Ana Rodrigues Gonçalves","Carlos Fernandes Costa","Isabel Pereira Ribeiro","Luís Almeida Teixeira","Lúcia Santos Barbosa","Ricardo Gonçalves Pereira","Marta Rodrigues Ferreira","António Teixeira Oliveira","Sofia Fernandes Costa","Fernando Silva Almeida","Catarina Pereira Ribeiro", "Miguel Almeida Carvalho",
        "Teresa Gonçalves Rodrigues","Manuel Fernandes Teixeira","Beatriz Ribeiro Pereira","Hugo Costa Almeida","Vera Santos Gonçalves","Paulo Alves Ribeiro","Cláudia Mendes Silva","André Sousa Oliveira","Helena Costa Rodrigues","Nuno Pereira Almeida","Inês Gonçalves Teixeira","Fábio Alves Ribeiro","Sara Fernandes Costa","Gonçalo Silva Oliveira","Lara Rodrigues Ferreira",
        "José Pereira Almeida","Carolina Santos Ribeiro","Rui Teixeira Oliveira","Ingrid Fernandes Costa","Guilherme Almeida Barbosa","Tatiana Oliveira Silva","Rafael Carvalho Pereira","Daniela Costa Rodrigues","Leandro Santos Ribeiro","Clara Oliveira Almeida","Bruno Pereira Costa","Mariana Rodrigues Gonçalves","Tiago Silva Almeida","Isabela Ribeiro Teixeira",
        "Davi Almeida Costa","Larissa Teixeira Gonçalves","Marcelo Fernandes Pereira","Fernanda Santos Oliveira","Vinícius Pereira Costa","Lucas Alves Ribeiro","Mirella Gonçalves Silva","Joana Oliveira Teixeira","Gustavo Carvalho Almeida","Larissa Costa Ribeiro","Lucas Ribeiro Teixeira","Matheus Almeida Gonçalves","Valentina Santos Costa","Felipe Fernandes Silva",
        "Gabriela Pereira Teixeira","Leonardo Costa Almeida","Nina Gonçalves Ribeiro","Daniel Silva Teixeira","Eduarda Alves Oliveira","Sophia Pereira Ribeiro","Isaac Fernandes Costa","Lorenzo Almeida Teixeira","Júlia Teixeira Gonçalves","Bianca Santos Almeida","Arthur Rodrigues Costa","Amanda Oliveira Silva","Laura Almeida Teixeira","Enzo Ribeiro Pereira",
        "Alice Fernandes Costa","João Miguel Silva Oliveira","Isadora Santos Ribeiro","Gabriel Teixeira Almeida","Miguel Pereira Costa","Luna Gonçalves Ribeiro","Theo Oliveira Teixeira","Sophie Almeida Costa","Cauã Rodrigues Silva","Marina Santos Pereira","Benjamin Ribeiro Teixeira","Larissa Fernandes Almeida","Enzo Costa Gonçalves","Ana Clara Alves Teixeira",
        "Luiza Pereira Ribeiro","Thiago Oliveira Costa","Fernanda Fernandes Silva","Caio Almeida Pereira","Clara Santos Costa","Lucas Rodrigues Teixeira","Eduardo Teixeira Gonçalves","Lorena Pereira Almeida","Pedro Henrique Costa Ribeiro","Helena Almeida Silva","Samuel Fernandes Oliveira","Bruna Ribeiro Teixeira","Raul Silva Costa","Mariana Pereira Almeida",
    )

    var generos = arrayOf("Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino",
        "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino"
    )

    var idades = arrayOf( 25, 32, 42, 28, 35, 47, 20, 31, 56, 40, 22, 29, 38, 50, 27, 33, 44, 21, 37, 48, 26,
        41, 30, 54, 36, 23, 39, 46, 24, 52, 34, 47, 20, 43, 55, 45, 60, 19, 53, 49, 58, 18, 51, 57, 61, 64, 63, 59, 62, 68, 70, 72, 66, 65, 71, 75, 69, 67, 74, 76, 73, 80, 78, 77, 79, 84, 82, 85, 81, 88, 90, 87, 83, 86, 92, 93, 89, 91, 94, 97, 95, 96, 98, 99, 100, 102, 105, 103, 101, 104, 107, 106, 108, 109, 110, 112, 111, 113, 115, 114
    )

    var cargos = arrayOf(  "Desenvolvedor de Software","Engenheiro de Software","Analista de Sistemas","Administrador de Redes","Arquiteto de Soluções","Designer de Interface de Usuário (UI/UX)","Engenheiro de Dados","Cientista de Dados","Analista de Segurança da Informação","Administrador de Banco de Dados","Especialista em Cloud Computing",
        "Analista de Qualidade de Software","Gerente de Projetos de T.I","Analista de Suporte Técnico","Especialista em Redes e Telecomunicações","Desenvolvedor Web","Analista de Business Intelligence","Engenheiro de DevOps","Analista de Business Analyst","Especialista em Inteligência Artificial","Administrador de Sistemas","Especialista em Machine Learning","Engenheiro de Site Reliability (SRE)",
        "Desenvolvedor Front-end","Desenvolvedor Back-end","Especialista em Cibersegurança","Analista de Dados Empresariais","Engenheiro de Redes","Desenvolvedor Mobile","Analista de Suporte ao Cliente","Engenheiro de Redes e Segurança","Especialista em Big Data", "Engenheiro de Software Embarcado","Analista de Infraestrutura de T.I","Especialista em Realidade Virtual","Engenheiro de Software de Jogos","Desenvolvedor de Aplicativos Móveis","Analista de Sistemas ERP", "Especialista em Sistemas Embarcados", "Especialista em Blockchain","Administrador de Banco de Dados Oracle","Analista de Dados de Negócios","Analista de Integração de Sistemas","Desenvolvedor Full-Stack","Especialista em Business Intelligence",
        "Engenheiro de Dados de Negócios","Administrador de Banco de Dados SQL Server","Especialista em Engenharia de Dados","Analista de Suporte a Servidores","Engenheiro de Dados de Nuvem","Analista de Requisitos de Software","Desenvolvedor Java","Engenheiro de Software C++","Analista de Infraestrutura de Nuvem","Analista de Sistemas Web","Engenheiro de Software Python","Especialista em Segurança de Rede",
        "Engenheiro de Software Ruby","Especialista em Redes Sem Fio","Administrador de Banco de Dados MySQL","Analista de Suporte a Redes","Desenvolvedor PHP","Engenheiro de Software .NET","Analista de Suporte de Aplicativos","Especialista em Redes Cisco","Engenheiro de Software JavaScript","Analista de Redes e Comunicações","Especialista em Virtualização","Administrador de Banco de Dados MongoDB","Analista de Segurança de Rede", "Desenvolvedor Swift","Especialista em Redes Juniper","Engenheiro de Software Go","Analista de Redes de Computadores", "Especialista em Segurança de Aplicativos","Engenheiro de Software Kotlin", "Especialista em Inteligência de Negócios","Analista de Banco de Dados", "Analista de Suporte a Sistemas","Especialista em Automação de Redes","Engenheiro de Software Rust","Desenvolvedor de Jogos", "Analista de Testes de Software","Especialista em Análise de Dados","Analista de Infraestrutura de Banco de Dados", "Desenvolvedor de Aplicativos Web","Especialista em Gerenciamento de Projetos",
        "Analista de Operações de T.I","Especialista em Computação em Nuvem","Engenheiro de Software Scala","Analista de Suporte de Desktop","Analista de Redes Sociais","Desenvolvedor de Aplicativos de Realidade Aumentada","Especialista em Automação de Processos","Analista de Segurança de Aplicativos","Analista de Suporte a Datacenter","Especialista em Automação de Testes","Engenheiro de Software TypeScript","Desenvolvedor de Aplicativos Híbridos","Analista de Suporte Técnico de Nuvem"
    )

    var salarios = arrayOf(3500, 4200, 5100, 4800, 6300, 3800, 4900, 5600, 7200, 3600, 4500, 5800, 6000, 4700, 4300, 5500, 6800, 7500, 4000, 5700, 4100, 4400, 6200, 5400, 7000, 4600, 6600, 5900, 5200, 5300, 4800, 6100, 3900, 6700, 4800, 4200, 6800, 7300, 5700, 4500, 4000, 5000, 6400, 3800, 7600, 6500, 5100, 5600, 4900, 7400, 4300, 3600, 5300, 5400, 5900, 4700, 6200, 4100, 7200, 6300, 4400, 5800, 7800, 6700, 6000, 5000, 3900, 4700, 6900, 5500, 4600, 4800, 7000, 5700, 4500, 6500, 7500, 3500, 4300, 6600, 4000, 6100, 7700, 5200, 4200, 6400, 5800, 3800, 7300, 4100, 5400, 7600, 4900, 5300, 6800, 6300, 4400, 6300, 3800, 4900)



    var homemMaisVelho = ""; var mulherMaisVelha = ""; var homemMaisNovo = ""; var mulherMaisNova = ""
    var idadeDoHomemVelho = 0; var idadeDaMulherVelha = 0; var idadeDoHomemNovo = 0; var idadeDaMulherNova = 0

    var homensIdadeMedia = 0; var mulheresIdadeMedia = 0; var mediaDeTodos = 0;
    var quantiaDeHomens = 0; var quantiaDeMulheres = 0

    var salarioMaiorDoHomem = 0;
    var salarioMenorDoHomem = 0;
    var salarioMaiorDaMulher = 0;
    var salarioMenorDaMulher = 0;

    var homensMaiorSalario = "";
    var homensMenorSalario = "";
    var mulheresMaiorSalario = "";
    var mulheresMenorSalario = ""
    var homensSalarioMedio = 0;
    var mulheresSalarioMedio = 0;
    var todosSalariosMedio = 0;

    var salarioMaiorDoDiretor = 0; var nomeDoDiretor = "";
    var nomeCompleto = ""; var maioresDe18 = ""; var inicialA = ""

    var lintagemDaPessoas = mutableListOf<String>()
    var listagemDasPessoasComA = mutableListOf<String>()

    for (i in 0..99) {
        if ( generos.get(i).equals("Masculino")) {
            if (idadeDoHomemVelho == 0) idadeDoHomemVelho = idades.get(i)
            else if (idadeDoHomemVelho < idades.get(i)) {
                homemMaisVelho = nomes.get(i)
                idadeDoHomemVelho = idades.get(i)
            }

            if (idadeDoHomemNovo == 0) idadeDoHomemNovo = idades.get(i)
            else if(idadeDoHomemNovo > idades.get(i)) {
                homemMaisNovo = nomes.get(i)
                idadeDoHomemNovo = idades.get(i)
            }

            if (salarioMaiorDoHomem == 0) salarioMaiorDoHomem = salarios.get(i)
            else if (salarioMaiorDoHomem < salarios.get(i)) {
                homensMaiorSalario = nomes.get(i)
                salarioMaiorDoHomem = salarios.get(i)
            }

            if (salarioMenorDoHomem == 0) salarioMenorDoHomem = salarios.get(i)
            else if(salarioMenorDoHomem > salarios.get(i)) {
                homensMenorSalario = nomes.get(i)
                salarioMenorDoHomem = salarios.get(i)
            }
            quantiaDeHomens++
            homensIdadeMedia += idades.get(i)
            homensSalarioMedio += salarios.get(i)
        }

        if (generos.get(i).equals("Feminino")) {
            if(idadeDaMulherVelha < idades.get(i)) {
                mulherMaisVelha = nomes.get(i)
                idadeDaMulherVelha = idades.get(i)
            }

            if(idadeDaMulherNova == 0) idadeDaMulherNova = idades.get(i)
            else if(idadeDaMulherNova > idades.get(i) && generos.get(i).equals("Feminino")) {
                mulherMaisNova = nomes.get(i)
                idadeDaMulherNova = idades.get(i)
            }

            if (salarioMaiorDaMulher < salarios.get(i)) {
                mulheresMaiorSalario = nomes.get(i)
                salarioMaiorDaMulher = salarios.get(i)
            }

            if (salarioMenorDaMulher == 0) salarioMenorDaMulher = salarios.get(i)
            else if(salarioMenorDaMulher > salarios.get(i)) {
                mulheresMenorSalario = nomes.get(i)
                salarioMenorDaMulher = salarios.get(i)
            }
            quantiaDeMulheres++
            mulheresIdadeMedia += idades.get(i)
            mulheresSalarioMedio += salarios.get(i)
        }

        if(cargos.get(i).equals("Diretor")) {
            if (salarioMaiorDoDiretor < salarios.get(i)) {
                nomeDoDiretor = nomes.get(i)
                salarioMaiorDoDiretor = salarios.get(i)
            }
        }

        if(nomeCompleto.length < nomes.get(i).length) nomeCompleto = nomes.get(i)

        if(idades.get(i) == 18) lintagemDaPessoas.add(nomes.get(i))

        if(nomes.get(i).substring(0,1) == "A") {
            listagemDasPessoasComA.add(nomes.get(i))
        }
        mediaDeTodos += idades.get(i)
        todosSalariosMedio += salarios.get(i)
    }

    homensIdadeMedia /= quantiaDeHomens
    mulheresIdadeMedia /= quantiaDeMulheres
    mediaDeTodos /= idades.size

    homensSalarioMedio /= quantiaDeHomens
    mulheresSalarioMedio /= quantiaDeMulheres
    todosSalariosMedio /= salarios.size

    println("Quem é o homem mais velho? \nR: $homemMaisVelho com idade de $idadeDoHomemVelho")
    println("\nQuem é a mulher mais velho? \nR: $mulherMaisVelha com idade de $idadeDaMulherVelha")
    println("\nQuem é o homem mais novo? \nR: $homemMaisNovo com idade de $idadeDoHomemNovo")
    println("\nQuem é a mulher mais nova? \nR: $mulherMaisNova com idade de $idadeDaMulherNova")

    println("\nQual é a idade média dos homens? \nR:$homensIdadeMedia")
    println("\nQual é a idade média das mulheres? \nR:$mulheresIdadeMedia")
    println("\nQual é a idade média independente do genero? \nR:$mediaDeTodos")

    println("\nQuem é o homem com o maior salário? \nR:$homensMaiorSalario com o salário de $salarioMaiorDoHomem")
    println("\nQuem é o homem com o menor salário? \nR:$homensMenorSalario com o salário de $salarioMenorDoHomem")
    println("\nQuem é a mulher com o maior salário? \nR:$mulheresMaiorSalario com o salário de $salarioMaiorDaMulher")
    println("\nQuem é a mulher com o menor salário? \nR:$mulheresMenorSalario com o salário de $salarioMenorDaMulher")

    println("\nQual é a média dos salários dos homens? \nR:${ homensSalarioMedio}")
    println("\nQual é a média dos salários das mulheres? \nR:${mulheresSalarioMedio}")
    println("\nQual é a média dos salários independente do sexo? \nR:${ todosSalariosMedio} ")

    println("\nQuem é a pessoa com o cargo “Diretor” que possui o maior salário? \nR:$nomeDoDiretor com o salário de $salarioMaiorDoDiretor")
    println("\nQuem é a pessoa que tem o maior nome na empresa? \nR:$nomeCompleto contendo ${nomeCompleto.length} caracteres")
    println("\nQuem são as pessoas que possuem 18 anos? \nR:")
    for (nome in lintagemDaPessoas) {
        println(" $nome")
    }
    println("\nQuem são as pessoas que tem o nome iniciado em 'A'? \nR:")
    for (nome in listagemDasPessoasComA) {
        println(" $nome")
    }
}