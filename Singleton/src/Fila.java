public class Fila {

    private static Fila instancia;

    private String Documento;

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public static Fila getInstance() {
        if(instancia == null){
            instancia = new Fila();
        }
        return instancia;
    }

    private Fila() {

    }

    public void ImprimeDocumento()
    {

    }

    public void RemoveDocumento()
    {

    }

    public void RemoveTodosDocumentos()
    {

    }
}