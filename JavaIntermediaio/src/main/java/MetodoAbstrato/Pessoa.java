package MetodoAbstrato;

public class Pessoa
{
    private TipoDocumento tipoDocumento;
    private String numeroDocumeto;


    public Pessoa(TipoDocumento tipoDocumento, String numeroDocumeto)
    {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumeto = numeroDocumeto;
    }

    public TipoDocumento getTipoDocumento()
    {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento)
    {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumeto()
    {
        return numeroDocumeto;
    }

    public void setNumeroDocumeto(String numeroDocumeto)
    {
        this.numeroDocumeto = numeroDocumeto;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoDocumento=" + tipoDocumento +
                ", numeroDocumeto='" + numeroDocumeto + '\'' +
                '}';
    }
}
