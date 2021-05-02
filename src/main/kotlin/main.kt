import java.util.*

fun main(args: Array<String>) {
    val listCarros = mutableListOf<CarroProduct>()
    val listClientes = mutableListOf<Cliente>()
    val listFuncionario = mutableListOf<Funcionario>()
    var scan: Scanner = Scanner(System.`in`)
    var opcao = 0
    while (opcao != 3) {
        println("Bem vindo ao sistema da nossa concessionária.")
        println("1 - Montadora")
        println("2 - Pessoas")
        println("3 - Sair do sistema.")
        println("\nPor favor, selecione uma opção: ")
        opcao = scan.nextInt()
        when(opcao) {
            1 -> {
                println("1 - Montar carro")
                println("2 - Editar carro")
            }

            2 -> {
                println("1 - Cadastrar cliente")
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
                when(decisao) {
                    1 -> {
                        var cliente = Cliente()
                        print("Por favor, informe o nome do cliente: ")
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
                        var confere = listClientes.find {it.cpf == cpf}
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
                        var confere = listClientes.find {it.cpf == cpf}
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
                        if (decidirCargo == 1)
                        {
                            funcionario.cargo = "Linha de Montagem";
                        }
                        else if  (decidirCargo == 2)
                        {
                            funcionario.cargo = "Linha de Montagem";
                        }
                        else if (decidirCargo == 3)
                        {
                            funcionario.cargo = "TI";
                        }
                        else if (decidirCargo == 4)
                        {
                            funcionario.cargo = "Pátio";
                        }
                        else if (decidirCargo == 5)
                        {
                            funcionario.cargo = "Engenharia";
                        }
                        else if (decidirCargo == 6)
                        {
                            funcionario.cargo = "Manuntenção da Fábrica";
                        }
                        else if (decidirCargo == 7)
                        {
                            funcionario.cargo = "Segurança Patrimonial";
                        }
                        else if (decidirCargo == 8)
                        {
                            funcionario.cargo = "Importação e Exportação";
                        }
                        else if (decidirCargo == 9)
                        {
                            funcionario.cargo = "Compras e Vendas";
                        }
                        else if (decidirCargo == 10)
                        {
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
                            println("| Código: ${it.codigo} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |" +
                                    " Turno: ${it.turno} | Cargo: ${it.cargo}\n")
                        }
                        print("Selecione o CÓDIGO do funcionário que deseja editar: ")
                        var codigo: Int = scan.nextInt()
                        codigo = scan.nextInt()
                        var confere = listFuncionario.find {it.codigo.toInt() == codigo}
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
                                    if (decidirCargo == 1)
                                    {
                                        confere.cargo = "Linha de Montagem";
                                    }
                                    else if  (decidirCargo == 2)
                                    {
                                        confere.cargo = "Linha de Montagem";
                                    }
                                    else if (decidirCargo == 3)
                                    {
                                        confere.cargo = "TI";
                                    }
                                    else if (decidirCargo == 4)
                                    {
                                        confere.cargo = "Pátio";
                                    }
                                    else if (decidirCargo == 5)
                                    {
                                        confere.cargo = "Engenharia";
                                    }
                                    else if (decidirCargo == 6)
                                    {
                                        confere.cargo = "Manuntenção da Fábrica";
                                    }
                                    else if (decidirCargo == 7)
                                    {
                                        confere.cargo = "Segurança Patrimonial";
                                    }
                                    else if (decidirCargo == 8)
                                    {
                                        confere.cargo = "Importação e Exportação";
                                    }
                                    else if (decidirCargo == 9)
                                    {
                                        confere.cargo = "Compras e Vendas";
                                    }
                                    else if (decidirCargo == 10)
                                    {
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
                                 println("| Código: ${it.codigo} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |" +
                                         " Turno: ${it.turno} | Cargo: ${it.cargo}\n")
                         }
                         print("Selecione o CÓDIGO do funcionário que deseja editar: ")
                         var codigo: Int = scan.nextInt()
                         codigo = scan.nextInt()
                         var confere = listFuncionario.find {it.codigo == codigo}
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
                            println("| Código: ${it.codigo} | Nome: ${it.nome} | Telefone: ${it.telefone} | Endereco: ${it.endereco} |" +
                                    " Turno: ${it.turno} | Cargo: ${it.cargo}\n")
                        }
                    }

                    9 -> break

                    else -> println("Opção inválida")
                }
            }

            3 -> break

            else -> println("Opção inválida")
        }
    }
}