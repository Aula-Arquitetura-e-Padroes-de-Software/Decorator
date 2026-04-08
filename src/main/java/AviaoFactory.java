public class AviaoFactory {
    public static Aviao obterAviao(String tipo){
        Class classe = null;
        Object bjeto = null;
        try{
            classe = Class.forName("Aviao"+tipo);
            bjeto = classe.getDeclaredConstructor().newInstance();

        }catch (Exception e){
            throw new IllegalArgumentException("Tipo de Avião inexistente");
        }
        if (!(bjeto instanceof Aviao)){
            throw new IllegalArgumentException("Tipo de Avião invalido");
        }
        return (Aviao) bjeto;
    }
}
