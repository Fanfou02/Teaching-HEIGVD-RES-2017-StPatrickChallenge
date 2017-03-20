/**
 * Fichier: ERemoverStreamProcessor.java
 * Auteur : Francois Quellec
 * Email  : francois.quellec@heig-vd.ch
 * Date   : 20 mars 2017
 * Projet : Programmation Oriente Objet : TE2
 */

package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class ERemoverStreamProcessor implements IStreamProcessor{

    @Override
  public void process(Reader in, Writer out) throws IOException {
    BufferedReader br = new BufferedReader(in);
    BufferedWriter bw = new BufferedWriter(out);
    int c = br.read();
    while (c != -1) {
      c = br.read();
    }
    bw.flush();
  }
}
