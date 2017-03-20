package ch.heigvd.res.stpatrick;

import java.util.LinkedList;

/**
 * This class is responsible for providing different types of Stream Processors.
 * 
 * @author Olivier Liechti
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {
LinkedList<String> processors = new LinkedList<>();
   StreamProcessorsFactory(){
       processors.add("e-remover");
   }
  @Override
  public IStreamProcessor getProcessor() {
    return new BasicStreamProcessor();
  }

  @Override
  public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {
    if(processors.contains(processorName))
        return new ERemoverStreamProcessor();
    else 
        throw new UnknownNameException("The factory does not know any processor called " + processorName);
  }

}
