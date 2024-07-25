package umg.programacion2.PKG_Grupo3;

public class ClsGrupo3 {
    public float pi = 3.1416f;
    public float priarea(float area, float base)
    {
        return area*base;
    }
    public float paraarea(float altura, float base)
    {
        return base*altura;
    }
    public float volucin(float altura, float radio)
    {
        return pi*(radio*radio)*altura;
    }
}
