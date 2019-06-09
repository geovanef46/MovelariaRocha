package modeloBeans;
/**
 * Classe Beans da entidade relatorio
 * @author geovanef46
 */
public class BeansRelatorio {

    private int codRelatorio;
    private String data;
    private String contexto;
    private String gerente_CPF;
    
    

    /**
     * @return the codRelatorio
     */
    public int getCodRelatorio() {
        return codRelatorio;
    }

    /**
     * @param codRelatorio the codRelatorio to set
     */
    public void setCodRelatorio(int codRelatorio) {
        this.codRelatorio = codRelatorio;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the contexto
     */
    public String getContexto() {
        return contexto;
    }

    /**
     * @param contexto the contexto to set
     */
    public void setContexto(String contexto) {
        this.contexto = contexto;
    }

    /**
     * @return the gerente_CPF
     */
    public String getGerente_CPF() {
        return gerente_CPF;
    }

    /**
     * @param gerente_CPF the gerente_CPF to set
     */
    public void setGerente_CPF(String gerente_CPF) {
        this.gerente_CPF = gerente_CPF;
    }
    
    

}
