class CarroProduct: CarroBuilder() {

    var preco: Double = 0.0
    lateinit var dscMotor: String
    lateinit var anoDeFabricacao: Integer
    lateinit var modelo: String
    lateinit var montadora: String

    override fun buildPreco(preco: Double) {
        this.preco = preco
    }

    override fun buildDcsMotor(dscMotor: String) {
        this.dscMotor = dscMotor
    }

    override fun buildAnoDeFabricacao(anoFabricacao: Integer) {
        this.anoDeFabricacao = anoFabricacao
    }

    override fun buildModelo(modelo: String) {
        this. modelo = modelo
    }

    override fun buildMontadora(montadora: String) {
        this.montadora = montadora
    }

    override fun getCarro(): CarroProduct {
        return this
    }
}