package BuilderPattern;

public class BurgerKing extends LancheBuilder{

    public BurgerKing() {
        super();
    }

    @Override
    public String buildSanduiche() {
        lanche.setSanduiche("cheeseburger");
        return lanche.getSanduiche();
    }

    @Override
    public String buildBatata() {
        lanche.setBatata("grande");
        return lanche.getBatata();
    }

    @Override
    public String buildBrinquedo() {
        lanche.setBrinquedo("carrinho");
        return lanche.getBrinquedo();
    }

    @Override
    public String buildRefrigerante() {
        lanche.setRefrigerante("coca");
        return lanche.getRefrigerante();
    }

}
