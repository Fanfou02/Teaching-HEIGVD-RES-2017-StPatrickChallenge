/**
 * Fichier: ARemoverReader.java
 * Auteur : Francois Quellec
 * Email  : francois.quellec@heig-vd.ch
 * Date   : 20 mars 2017
 * Projet : Programmation Oriente Objet : TE2
 */

package ch.heigvd.res.stpatrick;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class ARemoverReader extends FilterWriter{

 public ARemoverReader(Writer wrappedWriter) {
        super(wrappedWriter);
    }
         @Override
    public void write(String str, int off, int len) throws IOException {
        this.write(str.toCharArray(), off, len);
    }
    
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for(int i = off; i < off + len; i++){
            if(cbuf[i] != 'a' && cbuf[i]!= 'A')
                super.write(cbuf[i]);
        }
    }
    
    @Override
    public void write(int c) throws IOException {
        if(c != 'a' && c!= 'A')
            super.write(c);  
    }
    
}
