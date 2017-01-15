package com.example.helloworld;

/**
 * Created by knnas on 13.01.2017.
 */

public class InitialData {
        public String psPayNum;
        public String inDate;
        public String termId;
        public String servCode;
        public String servType;
        public String account;
        public String payAmount;
        public String totalPayAmount;
        public String payType;
        public String inStatus;
        public String errCode;
        public String errText;
        public String parentPayId;
        public String flags;

    public InitialData(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14)
        {
            psPayNum = "";
            inDate = "";
            termId = "";
            servCode = "";
            servType = "";
            account = "";
            payAmount = "";
            totalPayAmount = "";
            payType = "";
            inStatus = "";
            errCode = "";
            errText = "";
            parentPayId = "";
            flags = "";
        }

    public InitialData(String PSPayNum, String INDate, String termID, String ServCode, String ServType, String Account,
                       String PayAmount, String TotalPayAmount, String PayType, String INStatus, String ErrCode,
                       String ErrText, String ParentPayID, String Flags)
        {
            psPayNum = PSPayNum;
            inDate = INDate;
            termId = termID;
            servCode = ServCode;
            servType = ServType;
            account = Account;
            payAmount = PayAmount;
            totalPayAmount = TotalPayAmount;
            payType = PayType;
            inStatus = INStatus;
            errCode = ErrCode;
            errText = ErrText;
            parentPayId = ParentPayID;
            flags = Flags;
        }
}
