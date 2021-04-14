package POO.Parte02.P2E05;

public class relogio {
  private int hora;
  private int minuto;
  private int segundo;

  public int getMinuto()
  {
      return minuto;
  }

  public int getSegundos()
  {
    return segundo;
  }


  public relogio (int hora, int minuto, int segundos)
  {
      this.hora = hora;
      this.minuto = minuto;
      this.segundo = segundos;
  }

  public void adiantar (int seg)
  {
    int segundosTotal; 
    segundosTotal =  hora * 3600 + minuto * 60 + segundo;
    segundosTotal = segundosTotal + seg % 86400;
    segundosTotal = segundosTotal % 86400;
    this.hora = segundosTotal / 3600;
    segundosTotal = segundosTotal % 3600;
    this.minuto = segundosTotal / 60;
    segundosTotal = segundosTotal % 60;
    this.segundo = segundosTotal;
  }

  
  public void atrasar (int seg)
  {
      int segundosTotal; 
      segundosTotal =  hora * 3600 + minuto * 60 + segundo;
      segundosTotal = segundosTotal - seg % 86400;
      segundosTotal = segundosTotal +  86400;
      segundosTotal = segundosTotal % 86400;
      this.hora = segundosTotal / 3600;
      segundosTotal = segundosTotal % 3600;
      this.minuto = segundosTotal / 60;
      segundosTotal = segundosTotal % 60;
      this.segundo = segundosTotal;
  }

  public String getHorario ()
  {
    return this.hora + ":" + this.minuto + ":" + this.segundo; 
  }
}
