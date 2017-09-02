package webpractice;

public abstract class AbstractAutomobile {

    /**
     * 車種区分
     */
    /*protected enum CarType {
        LIGHT_CAR,        //軽自動車
        STANDERD_CAR,    //普通者
        MEDIUM_CAR,        //中型車
        LARGE_CAR,        //大型車
        OVERSIZE        //特大車
    };*/

    private String Cartype[] = {
    		new String("LightCar"),
    		new String("Standerdcar"),
    		new String("medimucar")
    };
   
   public String toString(String cartype) {
//	   System.out.println(Cartype[0]);
	   if(cartype.equals(Cartype[0])) {
	   return Cartype[0];
	   }
	   else if(cartype.equals("Standerdcar")) {
	   return Cartype[1];
	   }
	   else if(cartype.equals("mediumcar")) {
		   return Cartype[2];
	   }
	   else 
		 return "登録されていない車種です";
   }

    /**
     * コンストラクタ
     */
    protected AbstractAutomobile(){

    }
    /**
     * コンストラクタ
     * @param carType 車種区分
     */
   /* protected AbstractAutomobile(CarType carType){
 		this.setCarType(carType) ;
    }

    /**
     * 車種区分
     */
    //private CarType carType;

    /**
     * @return 乗車定員
     */
    public abstract int getCapacity();


    /**
     * @return 車種(モデル)
     */
    public abstract String getCarModel();

    /**
     * @return 車種区分
     */
    /*public CarType getCarType() {
        return carType;
    }*/
    /**
     * @param carType 車種区分
     */
    /*public void setCarType(CarType carType) {
        this.carType = carType;
    }*/


    /**
     * @return 車種区分（文字列）
     */
   /* public String getCarTypeString(){
        String typeName = "" ;
        if(this.carType.equals(CarType.LIGHT_CAR)){
            typeName = "軽自動車";
        }else if(this.carType.equals(CarType.STANDERD_CAR)){
            typeName = "普通者";
        }else if(this.carType.equals(CarType.MEDIUM_CAR)){
            typeName = "中型車";
        }else if(this.carType.equals(CarType.LARGE_CAR)){
            typeName = "大型車";
        }else if(this.carType.equals(CarType.OVERSIZE)){
            typeName = "特大車";
        }
        return typeName ;
    }*/
}