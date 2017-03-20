/**
 * Fichier: ARemoverDecorator.java
 * Auteur : Francois Quellec
 * Email  : francois.quellec@heig-vd.ch
 * Date   : 20 mars 2017
 * Projet : Programmation Oriente Objet : TE2
 */

package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.Writer;


public class ARemoverDecorator implements IStreamDecoratorController{

      public Reader decorateReader(Reader inputReader){
          return inputReader;
      }
      
      public Writer decorateWriter(Writer outputWriter){
          return new ARemoverReader(outputWriter);
      }
}
