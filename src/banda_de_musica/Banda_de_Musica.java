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
public class Banda_de_Musica
{

    public static void main(String[] args) 
    {
        Instrumentos ins = new Instrumentos();
        IViento iviento = new IViento();
        ICuerda icuerda = new ICuerda();
        IPercusion ipercusion = new IPercusion();
        Flauta flauta = new Flauta();
        Trompeta trompeta = new Trompeta();
        Tuba tuba =  new Tuba();
        Saxofon saxofon = new Saxofon();
        GuitarraAcus guitarraacus = new GuitarraAcus();
       
        GuitarraElec guitarraelec = new GuitarraElec();
        Violin violin = new Violin();
        Arpa arpa = new Arpa();
        Bateria bateria = new Bateria();
        Bombo bombo = new Bombo();
        ins.tocar('A');
        // estos son los instrumentos de viento 
        
        
        iviento.tocar('1');
        flauta.tocar('b');
        trompeta.tocar('c');
        saxofon.tocar('d');
        
        //estos son los instrumentos de cuerda
        
        icuerda.tocar('2');
        guitarraacus.tocar('f');
        violin.tocar('g');
        arpa.tocar('h');
        
        // instrumentos de percusion
        ipercusion.tocar('3');
        bateria.tocar('i');
        bombo.tocar('j');
        
     
    }
    
}

