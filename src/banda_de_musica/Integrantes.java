/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda_de_musica;

/**
 *
 * @author Michael
 */
public class Integrantes 
{
    Instrumentos mi_instrumento;
    
    public Integrantes(Instrumentos ins)
    {
        mi_instrumento = ins;
    }
    public void tocarInstrumentos()
    {
        mi_instrumento.tocar('C');
    }
    public void cambiarinstrumentos(Instrumentos ins)
    {
        mi_instrumento = ins;
    }
    
}
