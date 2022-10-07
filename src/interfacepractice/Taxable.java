
package interfacepractice;


public interface Taxable 

{
    default double taxPercent()
    {
        return 10; 
    }

}