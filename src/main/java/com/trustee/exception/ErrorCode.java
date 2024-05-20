package com.trustee.exception;

import java.util.HashMap;

public class ErrorCode {

    private ErrorCode(){

    }

    // Lms Config errors
    public static final String PAYC01 = "PAYC01";
    public static final String PAYC02 = "PAYC02";
    public static final String PAYC03 = "PAYC03";
    public static final String PAYC04 = "PAYC04";
    public static final String PAYC05 = "PAYC05";
    public static final String PAYC06 = "PAYC06";

    // Generic errors
    public static final String MS500 = "MS500";
    public static final String MS400 = "MS400";
    public static final String MS401 = "MS401";
    public static final String MS402 = "MS401";
    public static final String MS403 = "MS403";
    public static final String MS900 = "MS900";
    public static final String MS901 = "MS901";
    public static final String MS902 = "MS902";
    public static final String MS903 = "MS903";
    public static final String MS904 = "MS904";

    public static final String MS905 = "MS905";

    // DLC
    public static final String DLC001 = "DLC001";

    // User errors
    public static final String MSU001 = "MSU001";
    public static final String MSU002 = "MSU002";
    public static final String MSU003 = "MSU003";
    public static final String MSU004 = "MSU004";
    public static final String MSU005 = "MSU005";
    public static final String MSU006 = "MSU006";
    public static final String MSU013 = "MSU013";
    public static final String MSU014 = "MSU014";
    public static final String MSU015 = "MSU015";
    public static final String MSU016 = "MSU016";
    public static final String MSU017 = "MSU017";

    // program entity code
    public static final String MSP001 = "MSP001";

    // transaction type code
    public static final String MSP002 = "MSP002";

    // party constituent type error
    public static final String MSP004 = "MSP004";

    // party signatory error
    public static final String MSP005 = "MSP005";
    public static final String MSP006 = "MSP006";
    public static final String MSP010 = "MSP010";
    public static final String MSP008 = "MSP008";
    public static final String MSP011 = "MSP011";
    public static final String MSP012 = "MSP012";
    public static final String MSP013 = "MSP013";
    public static final String MSP014 = "MSP014";
    public static final String MSP015 = "MSP015";
    public static final String MSP016 = "MSP016";
    public static final String MSP017 = "MSP017";
    public static final String MSP018 = "MSP018";

    // program deal auto sign
    public static final String MSP009 = "MSP009";

    // user Acess Error
    public static final String MSUA01 = "MSUA01";

    // Password error
    public static final String MSU007 = "MSU007";
    public static final String MSU008 = "MSU008";
    public static final String MSU009 = "MSU009";
    public static final String MSU010 = "MSU010";
    public static final String MSU011 = "MSU011";
    public static final String MSU012 = "MSU012";

    // Acl errors
    public static final String MSA001 = "MSA001";
    public static final String MSA002 = "MSA002";
    public static final String MSA003 = "MSA003";
    public static final String MSA004 = "MSA004";
    public static final String MSA005 = "MSA005";
    public static final String MSA006 = "MSA006";
    public static final String MSA007 = "MSA007";
    public static final String MSA008 = "MSA008";
    public static final String MSA009 = "MSA009";
    public static final String MSA010 = "MSA010";
    public static final String MSA011 = "MSA011";
    public static final String MSA012 = "MSA012";
    public static final String MSA013 = "MSA013";
    public static final String MSA014 = "MSA014";
    public static final String MSA015 = "MSA015";
    public static final String MSA016 = "MSA016";
    public static final String MSA017 = "MSA017";
    public static final String MSA018 = "MSA018";

    // Api message

    public static final String MSAP001 = "MSAP001";

    // prgram message

    public static final String MSP003 = "MSP003";
    public static final String MSP007 = "MSP007";

    // program instance detail

    public static final String PID001 = "PID001";
    public static final String PID002 = "PID002";
    public static final String PID003 = "PID003";
    public static final String PID004 = "PID004";
    public static final String PID005 = "PID005";
    public static final String PID006 = "PID006";

    // Success message
    public static final String MSS001 = "MSS001";
    public static final String MSS002 = "MSS002";
    public static final String MSS003 = "MSS003";
    public static final String MSS004 = "MSS004";
    public static final String MSS005 = "MSS005";
    public static final String MSS006 = "MSS006";
    public static final String MSS007 = "MSS007";
    public static final String MSS008 = "MSS008";
    public static final String MSS009 = "MSS009";
    public static final String MSS010 = "MSS010";
    public static final String MSS011 = "MSS011";
    public static final String MSS012 = "MSS012";
    public static final String MSS013 = "MSS013";
    public static final String MSS014 = "MSS014";
    public static final String MSS015 = "MSS015";
    public static final String MSS016 = "MSS016";
    public static final String MSS017 = "MSS017";
    public static final String MSS018 = "MSS018";
    public static final String MSS019 = "MSS019";
    public static final String MSS020 = "MSS020";
    public static final String MSS021 = "MSS021";
    public static final String MSS022 = "MSS022";
    public static final String MSS023 = "MSS023";
    public static final String MSS024 = "MSS024";
    public static final String MSS025 = "MSS025";
    public static final String MSS026 = "MSS026";
    public static final String MSS027 = "MSS027";
    public static final String MSS028 = "MSS028";
    public static final String MSS029 = "MSS029";

    // AdminService error
    public static final String MSAD001 = "MSAD001";
    public static final String MSAD002 = "MSAD002";
    public static final String MSAD003 = "MSAD003";
    public static final String MSAD004 = "MSAD004";
    public static final String MSAD005 = "MSAD005";
    public static final String MSAD006 = "MSAD006";
    public static final String MSAD007 = "MSAD007";
    public static final String MSAD008 = "MSAD008";
    public static final String MSAD009 = "MSAD009";
    public static final String MSAD010 = "MSAD010";
    public static final String MSAD011 = "MSAD011";
    public static final String MSAD012 = "MSAD012";
    public static final String MSAD013 = "MSAD013";
    public static final String MSAD014 = "MSAD014";
    public static final String MSAD015 = "MSAD015";
    public static final String MSAD016 = "MSAD016";
    public static final String MSAD017 = "MSAD017";
    public static final String MSAD018 = "MSAD018";
    public static final String MSAD019 = "MSAD019";
    public static final String MSAD020 = "MSAD020";
    public static final String MSAD021 = "MSAD021";
    public static final String MSAD022 = "MSAD022";
    public static final String MSAD023 = "MSAD023";
    public static final String MSAD024 = "MSAD024";
    public static final String MSAD025 = "MSAD025";
    public static final String MSAD026 = "MSAD026";
    public static final String MSAD027 = "MSAD027";
    public static final String MSAD028 = "MSAD028";
    public static final String MSAD029 = "MSAD029";
    public static final String MSAD030 = "MSAD030";
    public static final String MSAD031 = "MSAD031";
    public static final String MSAD032 = "MSAD032";
    public static final String MSAD033 = "MSAD033";
    public static final String MSAD034 = "MSAD034";
    public static final String MSAD035 = "MSAD035";
    public static final String MSAD036 = "MSAD036";
    public static final String MSAD037 = "MSAD037";
    public static final String MSAD038 = "MSAD038";
    public static final String MSAD039 = "MSAD039";
    public static final String MSAD040 = "MSAD040";
    public static final String MSAD041 = "MSAD041";
    public static final String MSAD042 = "MSAD042";
    public static final String MSAD043 = "MSAD043";
    public static final String MSAD044 = "MSAD044";
    public static final String MSAD045 = "MSAD045";
    public static final String MSAD046 = "MSAD046";
    public static final String MSAD047 = "MSAD047";
    public static final String MSAD048 = "MSAD048";

    // dlc
    public static final String MSDL100 = "MSDL100";
    public static final String MSDL101 = "MSDL101";
    public static final String MSDL102 = "MSDL102";
    public static final String MSDL103 = "MSDL103";
    public static final String MSDL104 = "MSDL104";
    public static final String MSDL105 = "MSDL105";
    public static final String MSAD049 = "MSAD049";
    public static final String MSAD050 = "MSAD050";
    public static final String MSAD051 = "MSAD051";
    public static final String MSAD052 = "MSAD052";
    public static final String MSAD053 = "MSAD053";
    public static final String MSAD054 = "MSAD054";
    public static final String MSAD055 = "MSAD055";
    public static final String MSAD056 = "MSAD056";

    // Document Type Service
    public static final String MSD002 = "MSD002";
    public static final String MSD004 = "MSD004";
    public static final String MSD005 = "MSD005";

    // Account Validation
    public static final String MSAV001 = "MSAV001";
    public static final String MSAV002 = "MSAV002";
    public static final String MSAV004 = "MSAV004";
    public static final String MSAV005 = "MSAV005";
    public static final String MSAV006 = "MSAV006";

    public static final String MSAV003 = "MSAV003";

    // Nach Config
    public static final String NACH001 = "NACH001";
    public static final String NACH002 = "NACH002";
    public static final String NACH003 = "NACH003";

    // MFA configration type error
    public static final String MFAC01 = "MFAC01";
    public static final String MFAC02 = "MFAC02";
    public static final String MFAC03 = "MFAC03";
    public static final String MFAC04 = "MFAC04";
    public static final String MFAC05 = "MFAC05";
    public static final String MFAC06 = "MFAC06";

    // Econtract Configuration
    public static final String ECC001 = "ECC001";
    public static final String ECC002 = "ECC002";
    public static final String ECC003 = "ECC003";
    public static final String ECC004 = "ECC004";
    // Bank Integration Service
    public static final String BIS001 = "BIS001";
    public static final String BIS002 = "BIS002";

    // Lms Config errors
    public static final String LMSC01 = "LMSC01";
    public static final String LMSC02 = "LMSC02";
    public static final String LMSC03 = "LMSC03";
    public static final String LMSC04 = "LMSC04";
    public static final String LMSC05 = "LMSC05";

    // Payout config errors
    public static final String ECC005 = "ECC005";
    public static final String ECC006 = "ECC006";
    public static final String ECC007 = "ECC007";


    // Payout Config Errors
    public static final String PAC001 = "PAC001";
    public static final String PAC002 = "PAC002";
    public static final String PAC003 = "PAC003";
    public static final String PAC004 = "PAC004";
    public static final String PAC005 = "PAC005";

    // TATA Active Directry
    public static final String TAD001 = "TAD001";

    // Nach Config Error
    public static final String NCE001 = "NCE001";

    // Bulk Account Upload Errors
    public static final String BAU001 = "BAU001";
    public static final String BAU002 = "BAU002";
    public static final String BAU003 = "BAU003";
    public static final String BAU004 = "BAU004";
    public static final String BAU005 = "BAU005";
    public static final String BAU006 = "BAU006";
    public static final String BAU007 = "BAU007";
    public static final String BAU008 = "BAU008";
    public static final String BAU009 = "BAU009";
    public static final String BAU0010 = "BAU0010";
    public static final String BAU0011 = "BAU0011";
    public static final String BAU0012 = "BAU0012";

    // Client Id
    public static final String CID001 = "CID001";
    public static final String CID002 = "CID002";

    // Payout Entity Checker Category Error
    public static final String PEC001 = "PEC001";


    protected static HashMap<String, String> responseData = new HashMap<>();

    // set error code, message
    public static void setErrors() {

        // Generic Errors
        responseData.put(MS900,
                "Password recovery mail already sent. Please check your spam or wait for 15  min for new reset request");
        responseData.put(MS901, "Link has been expired or invalid");
        responseData.put(MS902, "OTP is invalid or expired");
        responseData.put(MS903, "You have exceeded login attempts");
        responseData.put(MS904, "Invalid OTP");
        responseData.put(MS403, "You don't have permission to access this resource");
        responseData.put(MS401, "Unauthorized");
        responseData.put(MS402, "Please upload an excel file");

        responseData.put(MS905, "File upload failed. Please check with admin.");

        // program Errors
        responseData.put(MSP001, "Invalid Program Entity Code ");

        responseData.put(MSP003, "Program Entity Type is not present");
        responseData.put(MSP007, "Program Manager is mandatory");

        // transaction type Errors
        responseData.put(MSP002, "Invalid Transaction Type Code");

        // party constituent type code
        responseData.put(MSP004, "Party Constituent Type Not Found");

        // party signatory error
        responseData.put(MSP005, "Party signatory age should be more than 18");
        responseData.put(MSP006, "Party Signatory not found");
        responseData.put(MSP010, "Invalid file extension. File extension should be .jpg or .jpeg or .png");
        responseData.put(MSP008, "File size must not exceed 2MB");
        responseData.put(MSP011, "Duplicate Entity Signatory for ");
        responseData.put(MSP012, "Entity is mandatory");
        responseData.put(MSP013, "Signatory Email is mandatory");
        responseData.put(MSP014, "Signatory Name is mandatory");
        responseData.put(MSP015, "Signatory Mobile Number is mandatory");
        responseData.put(MSP016, "Remarks is required");
        responseData.put(MSP017, "Entity not Found");
        responseData.put(MSP018, "Either signatory email or mobile no is mandatory");

        // program deal auto sign
        responseData.put(MSP009, "Only 2 Signatories are Allowed for Auto Sign");
        //

        // Api

        responseData.put(MSAP001, "You Exceeded maximum tries. Kindly try again after 15 min");

        // User errors
        responseData.put(MSU001, "Incorrect User Id or Password");
        responseData.put(MSU002, "Your account has been locked. Please contact admin");
        responseData.put(MSU003, "Incorrect request. Please try again.");
        responseData.put(MSU004, "You have exceeded your maximum tries. Please try after 15 min");
        responseData.put(MSU005, "Old password is not correct");
        responseData.put(MSU017, "You are not a mobile user. Please contact the admin");

        // UserAcess Errors
        responseData.put(MSUA01, "User Access Updated successfully");

        // Password error
        responseData.put(MSU006, "Mail send successfully");
        responseData.put(MSU007, "Password reset successfully, Please login");
        responseData.put(MSU008, "Password changed-Reset successfully ");
        responseData.put(MSU009, "Logout Successfully");
        responseData.put(MSU010, "Incorrect User Id or Password");
        responseData.put(MSU011, "Incorrect User Id or Password");
        responseData.put(MSU012, "Incorrect User Id or Password");
        responseData.put(MSU013, "Resend password successfully");
        responseData.put(MSU014, "Access Denied");
        responseData.put(MSU015, "Something went wrong in encryption");
        responseData.put(MSU016, "Something went wrong in decryption");

        // Acl errors
        responseData.put(MSA001, "Module code is invalid");
        responseData.put(MSA002, "Service code is invalid");
        responseData.put(MSA003, "Function code is invalid");
        responseData.put(MSA004, "User Entity Link not found");
        responseData.put(MSA005, "Incorrect request. Please try again.");
        responseData.put(MSA006, "No roles assigned to user");
        responseData.put(MSA007, "User do not have access to view any module");
        responseData.put(MSA008, "Program Id is invalid");
        responseData.put(MSA009, "No programs assigned to user");
        responseData.put(MSA010, "No products assigned to user");
        responseData.put(MSA011, "No branches assigned to user");
        responseData.put(MSA012, "No departments assigned to user");
        responseData.put(MSA013, "Invalid Program. Not assigned to user");
        responseData.put(MSA014, "Rag name is required");
        responseData.put(MSA015, "Atleast one field is required to create a RAG");
        responseData.put(MSA016, "Product Look Up Value does not exists");

        // Payout config errors
        responseData.put(PAYC01, "Payout Configuration does not exist. Invalid config id : ");
        responseData.put(PAYC02, "Payout config does not exist for given program. Invalid program id : ");
        responseData.put(PAYC03, "payout config account does not exist. Invalid config id : ");
        responseData.put(PAYC04, "Program does not exist.");
        responseData.put(PAYC05, "payout config does not exist for given program. Invalid program id : ");
        responseData.put(PAYC06, "Payout Config does not exist with the given entityId or programId");





        // Success message
        responseData.put(MSS001, "Role added successfully");
        responseData.put(MSS002, "Role updated successfully");
        responseData.put(MSS003, "RAG created successfully");
        responseData.put(MSS004, "RAG Updated successfully");
        responseData.put(MSS005, "Entity Added successfully");
        responseData.put(MSS006, "Entity Updated successfully");
        responseData.put(MSS007, "Program Updated successfully");
        responseData.put(MSS008, "Program Added successfully");
        responseData.put(MSS009, "Branch added successfully");
        responseData.put(MSS010, "Branch Updated successfully");
        responseData.put(MSS011, "User Added successfully");
        responseData.put(MSS012, "Added department Successfully");
        responseData.put(MSS013, "Department updated successfully");
        responseData.put(MSS014, "Added bank Successfully");
        responseData.put(MSS015, "Bank Updated Successfully");
        responseData.put(MSS016, "Product Added Successfully");
        responseData.put(MSS017, "Product Updated Successfully");
        responseData.put(MSS018, "User updated successfully");
        responseData.put(MSS019, "Program Entity Type added successfully");
        responseData.put(MSS020, "Program Entity Type updated successfully");
        responseData.put(MSS021, "Program Entity Link updated successfully");
        responseData.put(MSS022, "Transaction Type updated successfully");
        responseData.put(MSS023, "Transaction Type added successfully");
        responseData.put(MSS024, "Program Entity Access added successfully");
        responseData.put(MSS025, "User Role link does not exists");
        responseData.put(MSS026, "Admin Added successfully");
        responseData.put(MSS027, "Configuration Added successfully");
        responseData.put(MSS028, "Configuration Updated successfully");
        responseData.put(MSS029, "Program activation updated");

        // admin service error
        responseData.put(MSAD001, "Role already exists : ");
        responseData.put(MSAD002, "Role does not exists. Invalid role id : ");
        responseData.put(MSAD003, "RAG does not exists. Invalid rag id : ");
        responseData.put(MSAD004, "Invalid Program Id  : ");
        responseData.put(MSAD005, "Invalid Product Code  : ");
        responseData.put(MSAD006, "Invalid Department Code : ");
        responseData.put(MSAD007, "Invalid Branch Code : ");
        responseData.put(MSAD008, "Entity does not exists. Invalid entity id : ");
        responseData.put(MSAD009, "Program does not exists. Invalid program id : ");
        responseData.put(MSAD010, "Branch already exists : ");
        responseData.put(MSAD011, "Branch does not exists. ");
        responseData.put(MSAD012, "Department does not exists. Invalid department code : ");
        responseData.put(MSAD013, "Bank does not exists. Invalid bank code : ");
        responseData.put(MSAD014, "Product does not exists. Invalid product code : ");
        responseData.put(MSAD015, "Email id already exists.");
        responseData.put(MSAD016, "Password and Confirm Password does not match");
        responseData.put(MSAD018, "Branch does not exists. ");
        responseData.put(MSAD019, "Product does not exists. Invalid product code : ");
        responseData.put(MSAD017, "Entity does not exists. Invalid entity id : ");
        responseData.put(MSAD020, "Department does not exists. Invalid department code : ");
        responseData.put(MSAD021, "Program does not exists. Invalid program id : ");
        responseData.put(MSAD022, "Role does not exists. Invalid role id : ");
        responseData.put(MSAD023, "RAG does not exists. Invalid rag id : ");
        responseData.put(MSAD024, "Incorrect request. Please try again.");
        responseData.put(MSAD025, "Bank does not exist. Invalid bank code : ");
        responseData.put(MSAD026, "Program Entity Type Link does not exists. Invalid Program Entity Type Code : ");
        responseData.put(MSAD027, "Entity Id is not sub-entity. Invalid Entity Id : ");
        responseData.put(MSAD028, "Invalid program manager entity");
        responseData.put(MSAD029, "Program Id does not exists. Invalid ProgramId : ");
        responseData.put(MSAD030, "Transaction Type Code List is empty");
        responseData.put(MSAD031, "Transaction Type does not exist. Invalid transaction type code : ");
        responseData.put(MSAD032, "Transaction Type already exists");
        responseData.put(MSAD033, "Program Entity Access Updated Successfully");
        responseData.put(MSAD034, "Look Up Value of Branch already exist");
        responseData.put(MSAD035, "Look Up Value of Product already exist");
        responseData.put(MSAD036, "Look Up Value of Department already exist");
        responseData.put(MSAD037, "Look Up Value already exist");
        responseData.put(MSAD038, "Program Entity Type already exists: ");
        responseData.put(MSAD039, "Deal Checker Entity not specified for the program");
        responseData.put(MSD002, "Unable to Updated the document type");
        responseData.put(MSD004, "Document Type not found");
        responseData.put(MSD005, "Duplicate look up value for entity");
        responseData.put(MSAD040, "Select at least one entity to link");
        responseData.put(MSAD041, "Invalid mobile number");
        responseData.put(MSAD042, "Invalid email input");
        responseData.put(MSAD043, "Special Characters are not allowed");
        responseData.put(MSAD044, "Aggregator Entity is required");
        responseData.put(MSAD045, "Link atleast 1 Entity with Admin");
        responseData.put(MSAD046, "Invalid Program Entity Type: ");
        responseData.put(MSAD047, "Invalid Deal checker entity");
        responseData.put(MSAD051, "Bank Code Already Exist");
        responseData.put(MSAD052, "Private instance not found");
        responseData.put(MSAD053, "Callback event not found");
        responseData.put(MSAD054, "Entity Name already exists");
        responseData.put(MSAD055, "Document Type Name already exists for the entity");
        responseData.put(MSAD056, "Product Name already exists for the entity");

        // DLC
        responseData.put(MSDL100, "Digital Ledger Config added for given program");
        responseData.put(MSDL101, "Digital Ledger Config updated");
        responseData.put(MSDL102, "Digital Ledger Account not found");
        responseData.put(MSDL103, "Digital Ledger Config not found");
        responseData.put(MSDL104, "Digital Ledger Config Part not found");
        responseData.put(MSDL105, "Digital Ledger Config Field not found");

        responseData.put(MSAD048, "Program name already exists");
        responseData.put(MSAD049, "Invalid Program Id");
        responseData.put(MSAD050, "Invalid Entity Id");

        // ACCOUNT_ VALIDATION
        responseData.put(MSAV001, "AccountId is Required Not found");
        responseData.put(MSAV002, "Account Validation Config Not Found");
        responseData.put(MSAV003, "AccountValidationConfig not found for programId: ");
        responseData.put(MSAV004, "Account additional fields required");
        responseData.put(MSAV005, "Bank Config Not Found");
        responseData.put(MSAV006, "Account Not Found");

        // Program instance detail
        responseData.put(PID001, "Service name is required");
        responseData.put(PID002, "Private instance Id is required");
        responseData.put(PID003, "Program instance mapped successfully");
        responseData.put(PID004, "Program instance updated successfully");
        responseData.put(PID005, "Program instance details not found");
        responseData.put(PID006, "Program private instance config not found");

        // nach config
        responseData.put(NACH001, "Nach Config Added Successfully");
        responseData.put(NACH002, "Nach Config Updated Successfully");
        responseData.put(NACH003, "Nach does not exists. Invalid Nach Config id : ");

        // MFA configration type error
        responseData.put(MFAC01, "mfaConfigId is Not Found ");
        responseData.put(MFAC02, "programId Is Not Found ");
        responseData.put(MFAC03, "Mfa Event Code Is Not Present ");
        responseData.put(MFAC04, "Unable to Find MfaEventCode and programdId and UserId");
        responseData.put(MFAC05, "Unable to Find UserId");

        responseData.put(MFAC06, "Unable to Find MfaEventCode");

        // Econtract Configuration
        responseData.put(ECC001, "Econtract Configuration not found");

        responseData.put(ECC002, "ProcessConfig Configuration is Empty");
        responseData.put(ECC003, "StampConfig Configuration is Empty");
        responseData.put(ECC004, "Branch Required for : ");
        // Lms Config errors
        responseData.put(LMSC01, "Lms or Program config already exist for the program id : ");
        responseData.put(LMSC02, "Lms config does not exist. Invalid config id :");
        responseData.put(LMSC03, "Lms config account does not exist. Invalid config id :");
        responseData.put(LMSC04, "Program does not exist. Invalid program id : ");
        responseData.put(LMSC05, "Lms config does not exist for given program. Invalid program id : ");


        // Bank Integration
        responseData.put(BIS001, "Bank Integration Not Found ");
        responseData.put(BIS002, "Unable to Download the excel");
        responseData.put(ECC005, "Document Type not found for the document Id :");
        responseData.put(ECC006, "Product not found for the product Id : ");

        // TATA Active Directry
        responseData.put(TAD001, "Error Response from the Server Or Active Directry");

        // Payout Config Errors
        responseData.put(PAC001, "Payout Config Entity list is Empty");
        responseData.put(PAC002, "Users list is empty");
        responseData.put(PAC004, "Br Document link is not present for ");
        responseData.put(PAC005, "Br Document is not uploaded for the Entity");

        // Nach Config Errors

        responseData.put(NCE001, "Nach Config Details is Empty");

        // Bulk Account Upload Errors
        responseData.put(BAU001, "Account Number is required");
        responseData.put(BAU002, "IFSC Code is required");
        responseData.put(BAU003, "Customer Name is required");
        responseData.put(BAU004, "Customer Reference Number is required");
        responseData.put(BAU005, "Customer Mobile Number is invalid");
        responseData.put(BAU006, "Configuration Field is Required for : ");
        responseData.put(BAU007, "Configuration Field is Required for : ");
        responseData.put(BAU008, "Error downloading excel file");
        responseData.put(BAU009, "Account Number already exists");
        responseData.put(BAU0010, "Additional Field is Required for : ");
        responseData.put(BAU0011, "Bank does not match with IFSC code");
        responseData.put(BAU0012, "Account Number already exists in master");

        // Client id
        responseData.put(CID001, "Client Id Is Required ");
        responseData.put(CID002, "Static Token Is Required ");

        // Payout Entity Checker Category Error
        responseData.put(PEC001, "PayoutCheckerCategoryId is not found");
    }

    public static String getErrorDetails(String errorCode) {
        setErrors();
        return responseData.get(errorCode);
    }

    public static String getErrorMessage(String errorCode) {
        String message = getErrorDetails(errorCode);
        if (message != null) {
            return message;
        }
        return errorCode;
    }
}
