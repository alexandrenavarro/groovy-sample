import groovy.lang.Binding;
import groovy.lang.GroovyShell;


public class Main {

    
    /**
     * main.
     *
     * @param args
     */
    public static void main(String... args) {
     
        final Binding binding = new Binding();
        
        binding.setVariable("book", new SuperString("book1"));
        binding.setVariable("ptf", new SuperString("ptf1"));
        binding.setVariable("gop", new SuperString("gop1"));

        final GroovyShell shell = new GroovyShell(binding);
        final Object result = shell.evaluate("gop.in('gop1','gop2') and ptf.notIn('ptf1')");
        System.out.println("result=" + result);
        
    }
}
