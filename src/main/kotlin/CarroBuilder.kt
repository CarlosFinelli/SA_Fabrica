abstract open class CarroBuilder {
    abstract fun buildPreco(preco: Double)
    abstract fun buildDcsMotor(dscMotor: String)
    abstract fun buildAnoDeFabricacao(anoFabricacao: Integer)
    abstract fun buildModelo(modelo: String)
    abstract fun buildMontadora(montadora: String)
    abstract fun getCarro(): CarroProduct
}