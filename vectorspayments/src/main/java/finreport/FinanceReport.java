package finreport;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
public class FinanceReport {

    private Payment[] arraysOfPayments;
    private static final String[]MONTH={"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    public FinanceReport(int size){
        arraysOfPayments = new Payment[size];
    }

    public FinanceReport(FinanceReport copyFinanceReport){
        this.arraysOfPayments=new Payment[copyFinanceReport.arraysOfPayments.length];
        for(int i=0, j=0; i<copyFinanceReport.getNumberOfPayments(); j++){
            if (copyFinanceReport.getIPayments(j) != null) {
                this.arraysOfPayments[j]=new Payment(copyFinanceReport.arraysOfPayments[j]);
                i++;
            }

        }
    }

    public void outputData(String fileName)throws IOException {
        FileWriter writer = new FileWriter(fileName, false);
        int number = this.getNumberOfPayments();
        writer.write(number + "\n");
        for (int i=0; i<arraysOfPayments.length; i++) {
            writer.write(arraysOfPayments[i].toString()+"\n");
        }
        writer.flush();
        writer.close();
    }

    public void inputData(String fileName)throws IOException, WrongQuantity, BadDateException {
        int number,day, month, year, amount, nowPayments;
        String fileData, name;
        String []dataPayment = new String[11];
        String []date = new String[3];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        fileData = reader.readLine();
        if(Integer.parseInt(fileData)>(arraysOfPayments.length-this.getNumberOfPayments())){
            throw new WrongQuantity();
        }
        nowPayments=this.getNumberOfPayments();
        number=Integer.parseInt(fileData);
        for(int i=0; i<number; i++){
            if((fileData=reader.readLine())==null){
                throw new WrongQuantity();
            }
            dataPayment=fileData.split(" ");
            date=dataPayment[5].split("[.]");
            day=Integer.parseInt(date[0]);
            month=Integer.parseInt(date[1]);
            year=Integer.parseInt(date[2]);
            amount=Integer.parseInt(dataPayment[7])*100 + Integer.parseInt(dataPayment[9]);
            name = dataPayment[1].substring(1)+" "+dataPayment[2]
                    +" "+dataPayment[3].substring(0,dataPayment[3].length()-1);
            arraysOfPayments[nowPayments+i]=new Payment(name, day, month, year, amount);
        }
        reader.close();
    }

    public int getNumberOfPayments(){
        int number=0;
        while(number<arraysOfPayments.length && arraysOfPayments[number]!=null){
            number++;
        }
        return number;
    }

    public Payment getIPayments(int numberOfPayment){
        return arraysOfPayments[numberOfPayment];
    }

    public void setIPayments(int numberOfPayment, Payment payment){
        this.arraysOfPayments[numberOfPayment] = new Payment(payment);
    }

    public void getAllLastnamePayments(char startOfLastname, String fileName)throws IOException{
        FileWriter writer= new FileWriter(fileName, false);
        int rub, cop;
        for (Payment payment: arraysOfPayments) {
            if(payment.getName().charAt(0)==startOfLastname){
                rub=payment.getAmount()/100;
                cop=payment.getAmount()-rub*100;
                writer.write(String.format("Плательщтик: \"%s\" дата: %d.%d.%d сумма %d руб. %d коп.\n",
                        payment.getName(), payment.getDay(),
                        payment.getMonth(), payment.getYear(), rub, cop));
            }
        }
        writer.flush();
        writer.close();
    }

    public void getAllLowPayments(int amount, String fileName) throws IOException{
        FileWriter writer= new FileWriter(fileName, false);
        int rub, cop;
        for(Payment payment:arraysOfPayments){
            if(payment.getAmount()<amount){
                rub=payment.getAmount()/100;
                cop=payment.getAmount()-rub*100;
                writer.write(String.format("Плательщтик: \"%s\" дата: %d.%d.%d сумма %d руб. %d коп.\n",
                        payment.getName(), payment.getDay(),
                        payment.getMonth(), payment.getYear(), rub, cop));
            }
        }
        writer.flush();
        writer.close();
    }

    public int getAmountOfPaymentsOnDate(String date){
        String[]fullDate=date.split("[.]");
        int amount=0, day=Integer.parseInt(fullDate[0]), month=Integer.parseInt(fullDate[1]),
                year=Integer.parseInt(fullDate[2]);
        for(Payment payment:arraysOfPayments){
            if(payment.getDay()==day && payment.getMonth()==month && payment.getYear()==year){
                amount+=payment.getAmount();
            }
        }
        return amount;
    }

    public String getListOfMonth(int year){
        String listOfMonth="";
        int[]arrayOfCounter= new int[12];
        for(Payment payment:arraysOfPayments){
            if(payment.getYear()==year) {
                arrayOfCounter[payment.getMonth() - 1]++;
            }
        }
        for(int i=0; i<12; i++){
            if(arrayOfCounter[i]!=0){
                listOfMonth=listOfMonth + MONTH[i]+ "\n";
            }
        }
        return listOfMonth;
    }
}
