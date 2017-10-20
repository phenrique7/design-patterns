package BuilderPattern;

public class Bobs extends LancheBuilder{

    public Bobs() {
        super();
    }

    @Override
    public String buildSanduiche() {
        lanche.setSanduiche("hambúrger");
        return lanche.getSanduiche();
    }

    @Override
    public String buildBatata() {
        lanche.setBatata("pequena");
        return lanche.getBatata();
    }

    @Override
    public String buildBrinquedo() {
        lanche.setBrinquedo("carrinho");
        return lanche.getBrinquedo();
    }

    @Override
    public String buildRefrigerante() {
        lanche.setRefrigerante("guaraná");
        return lanche.getRefrigerante();
    }

}
