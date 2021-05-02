import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    val listCarros = mutableListOf<CarroProduct>()
    val listClientes = mutableListOf<Cliente>()
    val listFuncionario = mutableListOf<Funcionario>()
    var scan: Scanner = Scanner(System.`in`)
    var opcao = 0
    while (opcao != 3) {
        try {
        println("Bem vindo ao sistema da nossa concessionária.")
        println("1 - Montadora")
        println("2 - Pessoas")
        println("3 - Sair do sistema.")
        print("\nPor favor, selecione uma opção: ")
        opcao = scan.nextInt()
        when (opcao) {
            1 -> {
                println("\n\n\n1 - Montar veículo")
                println("2 - Editar veículo")
                println("3 - Remover veículo")
                println("4 - Listar veículos")
                print("\nPor favor, selecione uma opção: ")
                var decisao = scan.nextInt()
                when (decisao) {
                    1 -> {
                        try {
                            var veiculo = CarroProduct()
                            print("\n\nInforme o modelo do carro: ")
                            veiculo.modelo = scan.nextLine()
                            veiculo.modelo = scan.nextLine()
                            print("Informe o preço do veículo: ")
                            veiculo.preco = scan.nextDouble()
                            print("Informe a descrição do motor do veículo: ")
                            veiculo.dscMotor = scan.nextLine()
                            print("Informe o ano de fabricação do veículo: ")
                            veiculo.anoDeFabricacao = scan.nextInt()
                            print("Informe a montadora deste veículo: ")
                            veiculo.montadora = scan.nextLine();
                            print("Informe se o carro será exibido nas buscas \"1 - Sim, 2 = Não\": ")
                            var busca = scan.nextInt()
                            if (busca == 1) {
                                veiculo.exibicao = true
                            } else if (busca == 2) {
                                veiculo.exibicao = false
                            } else {
                                println("Opção inválida.")
                                continue
                            }
                            if (listCarros.size < 1) {
                                veiculo.codVeiculo = 1
                            } else {
                                var encontra = listCarros.last()
                                veiculo.codVeiculo = encontra.codVeiculo + 1
                            }
                            listCarros.add(veiculo)
                            continue
                        } catch (e: IOException) {
                            println("Algum erro ocorreu.")
                            e.stackTrace
                            continue
                        }
                    }

                    2 -> {
                        try {
                            println("\n\n")
                            listCarros.forEach {
                                if (it.exibicao == true) {
                                    println(
                                        "| Código: ${it.codVeiculo} | Modelo: ${it.modelo} | Preço: ${it.preco} | Ano Fabricação: ${it.anoDeFabricacao} |" +
                                                "| Descrição do motor: ${it.dscMotor} |\n| Montadora: ${it.montadora} |"
                                    )
                                }
                            }
                            print("Informe o código do veículo que deseja editar: ")
                            var codigo = scan.nextInt()
                            var encontra = listCarros.find { item -> item.codVeiculo == codigo }
                            if (encontra != null) {
                                println("\n\n\n1 - Modelo")
                                println("2 - Preço")
                                println("3 - Descrição do motor")
                                println("4 - Ano de fabricação")
                                println("5 - Montadora")
                                println("6 - Voltar a página inicial")
                                print("\nPor favor, selecione uma opção: ")
                                var decisao = scan.nextInt()
                                when (decisao) {
                                    1 -> {
                                        print("Insira o novo modelo do veículo: ")
                                        encontra.modelo = scan.nextLine()
                                        encontra.modelo = scan.nextLine()
                                        continue
                                    }

                                    2 -> {
                                        print("Informe o novo preço do veículo: ")
                                        encontra.preco = scan.nextDouble()
                                        continue
                                    }

                                    3 -> {
                                        print("Informe a nova descrição do motor: ")
                                        encontra.dscMotor = scan.nextLine()
                                        encontra.dscMotor = scan.nextLine()
                                        continue
                                    }

                                    4 -> {
                                        print("Informe o novo ano de fabricação do veículo: ")
                                        encontra.anoDeFabricacao = scan.nextInt()
                                        continue
                                    }

                                    5 -> {
                                        print("Informe a nova montadora do veículo: ")
                                        encontra.montadora = scan.nextLine()
                                        encontra.montadora = scan.nextLine()
                                        continue
                                    }

                                    6 -> {
                                        continue
                                    }

                                    else -> {
                                        println("Código inválido")
                                        continue
                                    }
                                }
                            } else {
                                println("Código inválido.")
                                continue
                            }
                        } catch (e: IOException) {
                            println("\n\nAlgum erro ocorreu.")
                            e.stackTrace
                            continue
                        }
                    }

                    3 -> {
                        try {
                            println("\n\n")
                            listCarros.forEach {
                                if (it.exibicao == true) {
                                    println(
                                        "| Código: ${it.codVeiculo} | Modelo: ${it.modelo} | Preço: ${it.preco} | Ano Fabricação: ${it.anoDeFabricacao} |" +
                                                "| Descrição do motor: ${it.dscMotor} |\n| Montadora: ${it.montadora} |"
                                    )
                                }
                            }
                            print("Informe o código do veículo que deseja remover da lista: ")
                            var codigo = scan.nextInt()
                            var encontra = listCarros.find { item -> item.codVeiculo == codigo }
                            if (encontra != null) {
                                listCarros.remove(encontra)
                            } else {
                                println("Código inválido.")
                                continue
                            }
                        } catch (e: IOException) {
                            println("\n\nAlgum erro ocorreu.")
                            e.stackTrace
                            continue
                        }
                    }

                    4 -> {
                        try {
                            println("\n\n")
                            listCarros.forEach {
                                if (it.exibicao == true) {
                                    println(
                                        "| Código: ${it.codVeiculo} | Modelo: ${it.modelo} | Preço: ${it.preco} | Ano Fabricação: ${it.anoDeFabricacao} |" +
                                                "| Descrição do motor: ${it.dscMotor} |\n| Montadora: ${it.montadora} |"
                                    )
                                }
                            }
                            continue

                        } catch (e: IOException) {
                            println("\n\nAlgum erro ocorreu.")
                            e.stackTrace
                            continue
                        }
                    }

                    5 -> {

                    }
                }
            }

            2 -> {
                try {
                    println("\n\n\n1 - Cadastrar cliente")
                    println("2 - Editar cliente")
                    println("3 - Excluir cliente")
                    println("4 - Cadastrar Funcionário")
                    println("5 - Editar Funcionário")
                    println("6 - Excluir Funcionário")
                    println("7 - Listar todos os clientes")
                    println("8 - Listar todos os funcionários")
                    println("9 - Voltar a página inicial")
                    println("\nPor favor, selecione uma opção: ")
                    var decisao = scan.nextInt()
                    when (decisao) {
                        1 -> {
                            var cliente = Cliente()
                            print("\n\nPor favor, informe o nome do cliente: ")
                            cliente.nome = scan.nextLine()
                            cliente.nome = scan.nextLine()
                            print("Por favor, informe o CPF do cliente: ")
                            cliente.cpf = scan.nextLine()
                            print("Por favor, informe o telefone do cliente: ")
                            cliente.telefone = scan.nextLine()
                            print("Por favor, informe o endereço do cliente: ")
                            cliente.endereco = scan.nextLine()
                            listClientes.add(cliente)
                            continue
                        }

                        2 -> {
                            listClientes.forEach {
                                println("| CPF: ${it.cpf} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |\n")
                            }
                            print("Selecione o CPF do cliente que deseja editar: ")
                            var cpf = scan.nextLine()
                            cpf = scan.nextLine()
                            var confere = listClientes.find { it.cpf == cpf }
                            if (confere != null) {
                                println("\n1 - Nome")
                                println("2 - CPF")
                                println("3 - Telefone")
                                println("4 - Endereço")
                                println("5 - Sair")
                                print("\nSelecione a opção que deseja editar: ")
                                var editar = scan.nextInt()
                                when (editar) {
                                    1 -> {
                                        print("Digite o novo nome do cliente: ")
                                        confere.nome = scan.nextLine()
                                        confere.nome = scan.nextLine()
                                        continue
                                    }

                                    2 -> {
                                        print("Digite o novo CPF: ")
                                        confere.cpf = scan.nextLine()
                                        continue
                                    }

                                    3 -> {
                                        print("Digite o novo Telefone: ")
                                        confere.telefone = scan.nextLine()
                                        continue
                                    }

                                    4 -> {
                                        print("Digite o novo Endereço: ")
                                        confere.endereco = scan.nextLine()
                                        continue
                                    }

                                    5 -> {
                                        continue
                                    }
                                }
                            } else {
                                println("CPF inválido")
                                continue
                            }
                        }

                        3 -> {
                            listClientes.forEach {
                                println("| CPF: ${it.cpf} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |\n")
                            }
                            print("Selecione o CPF do cliente que deseja excluir: ")
                            var cpf = scan.nextLine()
                            cpf = scan.nextLine()
                            var confere = listClientes.find { it.cpf == cpf }
                            if (confere != null) {
                                listClientes.remove(confere)
                            }
                        }

                        4 -> {
                            var funcionario = Funcionario()
                            print("\n\nPor favor, informe o nome do funcionário: ")
                            funcionario.nome = scan.nextLine()
                            funcionario.nome = scan.nextLine()
                            print("Informe o CPF do funcionário: ")
                            funcionario.cpf = scan.nextLine()
                            print("Informe o telefone do funcionário: ")
                            funcionario.telefone = scan.nextLine()
                            print("Informe o endereço do funcionário: ")
                            funcionario.endereco = scan.nextLine()
                            print("Informe o turno do funcionário \"1 - Manhã, 2 - Tarde, 3 - Noite\": ")
                            var turno = scan.nextInt()
                            if (turno == 1) {
                                funcionario.turno = "Manhã"
                            } else if (turno == 2) {
                                funcionario.turno = "Tarde"
                            } else if (turno == 3) {
                                funcionario.turno = "Noite"
                            } else if (turno < 1 || turno > 3) {
                                println("Opção inválida")
                                break
                            }
                            print("Cargos disponíveis: ")
                            print("\n -  1 - Linha de Montagem");
                            print("\n -  2 - Estoque de peças e insumos");
                            print("\n -  3 - TI");
                            print("\n -  4 - Pátio");
                            print("\n -  5 - Engenharia");
                            print("\n -  6 - Manuntenção da Fábrica");
                            print("\n -  7 - Segurança Patrimonial");
                            print("\n -  8 - Importação e Exportação");
                            print("\n -  9 - Compras e Vendas");
                            print("\n -  10 - Administração Geral");
                            print("\n\nPor favor, selecione uma opção: ")
                            var decidirCargo = scan.nextInt()
                            if (decidirCargo == 1) {
                                funcionario.cargo = "Linha de Montagem";
                            } else if (decidirCargo == 2) {
                                funcionario.cargo = "Linha de Montagem";
                            } else if (decidirCargo == 3) {
                                funcionario.cargo = "TI";
                            } else if (decidirCargo == 4) {
                                funcionario.cargo = "Pátio";
                            } else if (decidirCargo == 5) {
                                funcionario.cargo = "Engenharia";
                            } else if (decidirCargo == 6) {
                                funcionario.cargo = "Manuntenção da Fábrica";
                            } else if (decidirCargo == 7) {
                                funcionario.cargo = "Segurança Patrimonial";
                            } else if (decidirCargo == 8) {
                                funcionario.cargo = "Importação e Exportação";
                            } else if (decidirCargo == 9) {
                                funcionario.cargo = "Compras e Vendas";
                            } else if (decidirCargo == 10) {
                                funcionario.cargo = "Administração Geral";
                            } else if (decidirCargo < 1 || decidirCargo > 10) {
                                println("Cargo inválido")
                                break
                            }
                            if (listFuncionario.size > 0) {
                                funcionario.codigo = listFuncionario.last().codigo + 1
                            } else {
                                funcionario.codigo = 1
                            }
                            listFuncionario.add(funcionario)
                            continue
                        }

                        5 -> {
                            listFuncionario.forEach {
                                println(
                                    "| Código: ${it.codigo} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |" +
                                            " Turno: ${it.turno} | Cargo: ${it.cargo}\n"
                                )
                            }
                            print("Selecione o CÓDIGO do funcionário que deseja editar: ")
                            var codigo: Int = scan.nextInt()
                            codigo = scan.nextInt()
                            var confere = listFuncionario.find { it.codigo.toInt() == codigo }
                            if (confere != null) {
                                println("1 - Nome")
                                println("2 - CPF")
                                println("3 - Telefone")
                                println("4 - Endereço")
                                println("5 - Sair")
                                print("\nSelecione a opção que deseja editar")
                                var editar = scan.nextInt()
                                when (editar) {
                                    1 -> {
                                        print("Digite o novo nome do funcionário: ")
                                        confere.nome = scan.nextLine()
                                        continue
                                    }

                                    2 -> {
                                        print("Digite o novo CPF do funcionário: ")
                                        confere.cpf = scan.nextLine()
                                        continue
                                    }

                                    3 -> {
                                        print("Digite o novo Telefone do funcionário: ")
                                        confere.telefone = scan.nextLine()
                                        continue
                                    }

                                    4 -> {
                                        print("Digite o novo Endereço do funcionário: ")
                                        confere.endereco = scan.nextLine()
                                        continue
                                    }

                                    5 -> {
                                        print("Informe o turno do funcionário \"1 - Manhã, 2 - Tarde, 3 - Noite\": ")
                                        var turno = scan.nextInt()
                                        if (turno == 1) {
                                            confere.turno = "Manhã"
                                        } else if (turno == 2) {
                                            confere.turno = "Tarde"
                                        } else if (turno == 3) {
                                            confere.turno = "Noite"
                                        } else if (turno < 1 || turno > 3) {
                                            println("Opção inválida")
                                            break
                                        }
                                    }

                                    6 -> {
                                        print("Cargos disponíveis: ")
                                        print("\n -  1 - Linha de Montagem");
                                        print("\n -  2 - Estoque de peças e insumos");
                                        print("\n -  3 - TI");
                                        print("\n -  4 - Pátio");
                                        print("\n -  5 - Engenharia");
                                        print("\n -  6 - Manuntenção da Fábrica");
                                        print("\n -  7 - Segurança Patrimonial");
                                        print("\n -  8 - Importação e Exportação");
                                        print("\n -  9 - Compras e Vendas");
                                        print("\n -  10 - Administração Geral");
                                        print("\n\nPor favor, selecione uma opção: ")
                                        var decidirCargo = scan.nextInt()
                                        if (decidirCargo == 1) {
                                            confere.cargo = "Linha de Montagem";
                                        } else if (decidirCargo == 2) {
                                            confere.cargo = "Linha de Montagem";
                                        } else if (decidirCargo == 3) {
                                            confere.cargo = "TI";
                                        } else if (decidirCargo == 4) {
                                            confere.cargo = "Pátio";
                                        } else if (decidirCargo == 5) {
                                            confere.cargo = "Engenharia";
                                        } else if (decidirCargo == 6) {
                                            confere.cargo = "Manuntenção da Fábrica";
                                        } else if (decidirCargo == 7) {
                                            confere.cargo = "Segurança Patrimonial";
                                        } else if (decidirCargo == 8) {
                                            confere.cargo = "Importação e Exportação";
                                        } else if (decidirCargo == 9) {
                                            confere.cargo = "Compras e Vendas";
                                        } else if (decidirCargo == 10) {
                                            confere.cargo = "Administração Geral";
                                        } else if (decidirCargo < 1 || decidirCargo > 10) {
                                            println("Cargo inválido")
                                            break
                                        }
                                    }

                                    7 -> {
                                        break
                                    }
                                }
                            }
                        }

                        6 -> {
                            listFuncionario.forEach {
                                println(
                                    "| Código: ${it.codigo} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |" +
                                            " Turno: ${it.turno} | Cargo: ${it.cargo}\n"
                                )
                            }
                            print("Selecione o CÓDIGO do funcionário que deseja editar: ")
                            var codigo: Int = scan.nextInt()
                            codigo = scan.nextInt()
                            var confere = listFuncionario.find { it.codigo == codigo }
                            if (confere != null) {
                                listFuncionario.remove(confere)
                            }
                        }

                        7 -> {
                            listClientes.forEach {
                                println("| CPF: ${it.cpf} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |\n")
                            }
                        }

                        8 -> {
                            listFuncionario.forEach {
                                println(
                                    "| Código: ${it.codigo} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |" +
                                            " Turno: ${it.turno} | Cargo: ${it.cargo}\n"
                                )
                            }
                        }

                        9 -> break

                        else -> println("Opção inválida")
                    }
                } catch (e: IOException) {
                    println("\n\nAlgum erro ocorreu.")
                    e.stackTrace
                    continue
                }
            }

            3 -> break

            else -> println("Opção inválida")
        }
    } catch (e: IOException) {
        println("\n\nAlgum erro ocorreu.")
        e.stackTrace
        continue
    }
}
}