package BuilderPattern;

public class McDonalds extends LancheBuilder{

    public McDonalds(){
        super();
    }

    @Override
    public String buildSanduiche() {
        lanche.setSanduiche("hambúrger");
        return lanche.getSanduiche();
    }

    @Override
    public String buildBatata() {
        lanche.setBatata("média");
        return lanche.getBatata();
    }

    @Override
    public String buildBrinquedo() {
        lanche.setBrinquedo("bonequinha");
        return lanche.getBrinquedo();
    }

    @Override
    public String buildRefrigerante() {
        lanche.setRefrigerante("coca");
        return lanche.getRefrigerante();
    }

}
