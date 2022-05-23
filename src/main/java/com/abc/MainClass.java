class MainClass
{
  OtherClass otherClass= null;
  public MainClass()
  {
    otherClass = new OtherClass();
  }
  public static void main(Stirng a[])
  {
    MainClass main = new MainClass();
    main.callOtherClassMethod();
  }
  
  private void callOtherClassMethod()
  {
    otherClass.callingMethod();
  }
  
}
