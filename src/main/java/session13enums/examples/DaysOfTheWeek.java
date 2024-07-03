package session13enums.examples;

public enum DaysOfTheWeek {
  //Essentially instantiating your enums here with the parameters set in the constructor
  MONDAY(false),
  TUESDAY(false),
  WEDNESDAY(false),
  THURSDAY(false),
  FRIDAY(true),
  SATURDAY(true),
  SUNDAY(true);

  //Standard field
  private final boolean isWeekend;

  //Private constructor because the DaysOfTheWeek cannot be instantiated, but in here you will set your values up
  DaysOfTheWeek(boolean isWeekend){
    this.isWeekend = isWeekend;
  }

  //Method you can call on any day of the week to find out whether or not its the weekend
  public void isWeekend(){
    if(isWeekend == true){
      System.out.println("WOOOO Its the weekend!");
    } else {
      System.out.println("It's not the weekend");
    }
  }
}
