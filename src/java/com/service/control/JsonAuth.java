///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.service.control;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.util.EntityUtils;
///**
// *
// * @author Desarrollo1
// */
//public class JsonAuth implements Serializable {
//
//    //static org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(JsonAuth.class);
//    //private static String URL_Rest = "";
//    //private static String URL_Rest = "http://66.45.251.34:8080/rest"; //Ip Old
//    //private static String URL_Rest = "http://192.168.34.20/Modipay/rest"; // IP privada Desarrollo
//    //private static String URL_Rest = "http://200.91.204.38:9010/Modipay/rest"; // IP publica Desarrollo
//    //private static String URL_Rest = "http://192.168.34.21/Modipay/rest"; // IP privada produccion
//    //private static String URL_Rest = "http://200.91.204.38:8080/Modipay/rest"; // IP publica Produccion
//
//    //private static String URL_Rest = "http://200.91.204.38:9020/Modipay/rest"; // IP MEX publica Produccion
//    //private static String URL_Rest = "http://192.168.34.23/Modipay/rest"; // IP Mex privada
//    
//    private static String URL_Rest = "http://199.180.186.183/Modipay/rest";
//    public static void main(String args[]) throws Exception {
//        String user = "520812";
//        String passwd = "1234";
//
//        //System.out.println("consultarSaldoCuenta = " + consultarSaldoCuenta(user, passwd, "Vales"));
//        MemberPaymentInputData memberPaymentInputData = new MemberPaymentInputData();
//        memberPaymentInputData.setToMemberPrincipal("423274");
//        memberPaymentInputData.setAmount("100");
//        memberPaymentInputData.setDescription("Pago vales de prueba");
//        memberPaymentInputData.setTransferTypeId(61);
////
//        Gson gson = new Gson();
//        // 73999947     jdelgadop@taxislibres.com.co
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        InitialDataOutput initialDataOutput = initialData(user, passwd);
////        System.out.println("Main.initialDataOutput = " + gson.toJson(initialDataOutput));
////        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
////        InitialDataOutput initialDataOutput2 = initialData("96946765", "h0lb31N604a");
////        System.out.println("Main.initialDataOutput = " + gson.toJson(initialDataOutput2));
////        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
////        InitialDataOutput initialDataOutput3 = initialData("marcela@taxislibres.com.co", "19312869");
////        System.out.println("Main.initialDataOutput = " + gson.toJson(initialDataOutput3));
////        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
////        InitialDataOutput initialDataOutput4 = initialData("729079", "19312869");
////        System.out.println("Main.initialDataOutput = " + gson.toJson(initialDataOutput4));
////        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
////        for(CustomValue customValue : initialDataOutput.getProfile().getCustomValues()) {
////            if(customValue.getInternalName().equals("Convenio_Empresarial")) {
////                System.out.println("Value = " + customValue.getValue());
////            }
////        }
//        //System.setProperty("javax.xml.bind.JAXBContext", "com.sun.xml.internal.bind.v2.ContextFactory");
////        MemberPaymentInputData memberPaymentInputData = new MemberPaymentInputData();
////        memberPaymentInputData.setAmount("1");
////        memberPaymentInputData.setDescription("Se va con idUsuario member principal");
////        memberPaymentInputData.setTransferTypeId(61);
////        memberPaymentInputData.setToMemberPrincipal("330996");
//////        
//////////////        MemberPaymentOutput memberPaymentOutput = new MemberPaymentOutput();
//////////////        memberPaymentOutput = memberPayment(user, passwd, memberPaymentInputData);
//////////////        System.out.println("Main.memberPaymentOutput = " + gson.toJson(memberPaymentOutput, MemberPaymentOutput.class));
//////////////
//////////////        System.out.println("___________________________________________________________________________________________________");
//////////////
//////////////        ConfirmMemberPaymentOutput confirmMemberPaymentOutput = confirmMemberPayment(user, passwd, memberPaymentInputData);
//////////////        System.out.println("Main.confirmMemberPaymentOutput = " + gson.toJson(confirmMemberPaymentOutput, ConfirmMemberPaymentOutput.class));
//
////        
////        for(int i = 0; i <= 2000; i++) {
////            memberPaymentInputData.setTransferTypeId(i);
////            memberPaymentOutput = memberPayment("764314", "1234", memberPaymentInputData);
////            System.out.println("Main.memberPaymentOutput = " + gson.toJson(memberPaymentOutput, MemberPaymentOutput.class).toString());
////            
////            if(memberPaymentOutput.getErrorCode().equals("")) {
////                System.out.println("*******************************************************Encontrado " + i);
////            }
////       }
//////        ConfirmMemberPaymentOutput confirmMemberPaymentOutput = confirmMemberPayment("662747", "1234", memberPaymentInputData);
//////        System.out.println("Main.confirmMemberPaymentOutput = " + gson.toJson(confirmMemberPaymentOutput, ConfirmMemberPaymentOutput.class).toString());        
////        List<InfoResponse> lstInfoResponse = info("marcela@taxislibres.com.co", "19312869");
////
////        for (InfoResponse infoResponse : lstInfoResponse) {
////            System.out.println("infoResponse" + infoResponse.getAccount().getType().getName());
////            System.out.println("infoResponse" + infoResponse.getAccount().getType().getCurrency().getName());
////        }
//////        List<Accounts> lstCuentas = consultarCuentasMiembro("451744", "1234");
//////        System.out.println("------------------------------------------------------------------------------------");
//////        MemberResultPageTL memberResultPageTL = members("");
//////
//////        for (MemberTL member : memberResultPageTL.getMembers()) {
//////            System.out.println("------------------------------------------------");
//////            System.out.println("[Main]member.getId() = " + member.getId());
//////            System.out.println("[Main]member.getName() = " + member.getName());
//////            System.out.println("[Main]member.getUsername() = " + member.getUsername());
//////            System.out.println("[Main]member.getEmail() = " + member.getEmail());
//////            System.out.println("[Main]member.getGroupId() = " + member.getGroupId());
//////        }
////
////        //MemberPaymentOutput mpo = systemPayment("jdelgadop@taxislibres.com.co", "Taxi2Libre.", memberPaymentInputData);
////        System.out.println("---------------------------------------------------------------------------------------------------");
//////
////
////        PrincipalParametersTL principalParametersTL = new PrincipalParametersTL();
////        principalParametersTL.setPrincipalType("USER");
////        principalParametersTL.setPrincipal("227619");
////
////        MemberTL memberTL = buscarPorPrincipal(principalParametersTL);
////        System.out.println(" member.getEmail() = " + memberTL.getEmail());
////        System.out.println(" member.getId() = " + memberTL.getId());
//////        System.out.println(" member.getFields().get(0).getInternalName() = " + memberTL.getFields().get(0).getInternalName());
//////        System.out.println(" member.getFields().get(0).getValue() = " + memberTL.getFields().get(0).getValue());
////        System.out.println(" member.getName() = " + memberTL.getName());
////
////        System.out.println("----------------------------------------------------------------------------------------------------------");
////
//////        UpdateMemberParametersTL updateMemberParametersTL = new UpdateMemberParametersTL();
//////        updateMemberParametersTL.setId(new Long(74));
//////        updateMemberParametersTL.setPrincipalType("USER");
//////        updateMemberParametersTL.setPrincipal("227619");
//////        updateMemberParametersTL.setName("Juan Carlos Delgado P");
//////        updateMemberParametersTL.setEmail("jdelgadop223@taxislibres.com.co");
//////
//////        RegistrationFieldValueTL fieldsTL2 = new RegistrationFieldValueTL();
//////        fieldsTL2.setInternalName("mobilePhone");
//////        fieldsTL2.setFieldId(new Long(9));
//////        fieldsTL2.setDisplayName("Número Teléfono Móvil");
//////        fieldsTL2.setValue("3044280406");
//////
//////        updateMemberParametersTL.getFields().add(fieldsTL2);
//////
//////        actualizarMiembro(updateMemberParametersTL);
////
//////        System.out.println("----------------------------------------------------------------------------------------------------------");
//////        List<GroupTL> lstGroup = listarManagedGroups();
//////
//////        for (GroupTL groupTL : lstGroup) {
//////            System.out.println("listarManagedGroups groupTL.getId()" + groupTL.getId());
//////            System.out.println("listarManagedGroups groupTL.getName()" + groupTL.getName());
//////        }
//////
//////        System.out.println("---------------------------------------------------------------------------------------------------");
//////
//////        RegistrationFieldValueTL fieldsTL = new RegistrationFieldValueTL();
//////        fieldsTL.setInternalName("mobilePhone");
//////        fieldsTL.setFieldId(new Long(8));
//////        fieldsTL.setDisplayName("Número Teléfono Móvil");
//////        fieldsTL.setValue("3044280415");
//////
//////        RegisterMemberParametersTL paramsTL = new RegisterMemberParametersTL();
//////        paramsTL.getFields().add(fieldsTL);
//////        paramsTL.setGroupId(new Long(54));
//////        paramsTL.setEmail("prueba5@taxislibres.com.co");
//////        paramsTL.setName("jdelgado5");
//////        paramsTL.setLoginPassword("1234");
////////            System.setProperty("javax.xml.bind.JAXBContext", "com.sun.xml.internal.bind.v2.ContextFactory");
//////        MemberRegistrationResultTL memberRegistrationResultTL = registrarMiembro(paramsTL);
////////
//////        System.out.println("TEST: memberRegistrationResult.isAwaitingEmailValidation() = " + memberRegistrationResultTL.isAwaitingEmailValidation());
//////        System.out.println("TEST: memberRegistrationResult.getUsername() = " + memberRegistrationResultTL.getUsername());
//////        System.out.println("TEST: memberRegistrationResult.getId() = " + memberRegistrationResultTL.getId());
//////        System.out.println("TEST: memberRegistrationResult.getFaultString() = " + memberRegistrationResultTL.getFaultString());
////
////        System.out.println("------------------------------------------------------------------------------------------------------");
////        memberTL = buscarPorUsername("227619");
////        System.out.println(" member.getEmail() = " + memberTL.getEmail());
////        System.out.println(" member.getId() = " + memberTL.getId());
////        System.out.println(" member.getFields().get(0).getInternalName() = " + memberTL.getFields().get(0).getInternalName());
////        System.out.println(" member.getFields().get(0).getValue() = " + memberTL.getFields().get(0).getValue());
////        System.out.println(" member.getName() = " + memberTL.getName());
////
////        double saldo = consultarSaldoCuenta(user, passwd, "Vales Conductor");
////        System.out.println("Saldo en la cuenta = " + saldo);
////        System.out.println("Terminando");
//    }
//
//    public static String getURL_Rest() {
//        return URL_Rest;
//    }
//
//    public static void setURL_Rest(String URL_Rest) {
//        JsonAuth.URL_Rest = URL_Rest;
//    }
//
//    /**
//     * Consume el servicio REST de Modipay initialData, que trae los jsonObjIns
//     * de la cuenta, el perfil, dado un codigo de usuario y una clave.
//     *
//     * @author Juan Carlos Delgado P.
//     * @param codigoUsuario String con el codigo de usuario en Modipay.
//     * @param passwd String con la clave de Modipay.
//     * @return InitialDataOutput Objeto que contiene los jsonObjIns de la
//     * consulta initialData2.
//     */
//    public static InitialDataOutput initialData(String codigoUsuario, String passwd) {
//
//        String principalType = "";
//        Gson gson = new Gson();
//        InitialDataOutput initialDataOutput = null;
//        String jsonStrOut = "";
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        HttpGet get = new HttpGet(URL_Rest + "/access/initialData");
//        System.out.println("[JsonAuth.initialData] Conectando a:" + URL_Rest + "/access/initialData");
//
//        try {
//            get.setHeader("Content-Type", "application/json");
//            get.setHeader("Authorization", "Basic " + EncriptTool.encodeBase64(codigoUsuario + ":" + passwd));
//
//            HttpResponse resp = httpClient.execute(get);
//            jsonStrOut = EntityUtils.toString(resp.getEntity());
//
//            if (jsonStrOut != null) {
//                JSONObject jsonObj = new JSONObject(jsonStrOut);
//                if (jsonStrOut.contains("errorCode")) {
//
//                    System.out.println("erroCode:   " + jsonObj.get("errorCode"));
//
//                    initialDataOutput = gson.fromJson(jsonStrOut, InitialDataOutput.class);
//                } else {
//                    initialDataOutput = parseInitialData(jsonObj);
//                }
//            } else {
//                return null;
//            }
//
//            if (initialDataOutput == null) {
//                return null;
//            }
//        } catch (IOException ex) {
//            System.out.println("[JsonAuth.initData] IOException: " + ex.getMessage());
//            jsonStrOut = ex.getMessage();
//            System.out.println("jsonStrOut = " + jsonStrOut);
//
//            if (jsonStrOut.contains("Connection timed out")) {
//                initialDataOutput = new InitialDataOutput();
//                initialDataOutput.setErrorCode(jsonStrOut);
//                initialDataOutput.setErrorDetails(URL_Rest + "/access/initialData");
//            } else {
//                initialDataOutput = gson.fromJson(jsonStrOut, InitialDataOutput.class);
//            }
//        } catch (ParseException ex) {
//            System.out.println("Error al utilizar el servicio initialData. " + ex.getMessage());
//            initialDataOutput.setErrorCode("Error al Parsear Json");
//            initialDataOutput.setErrorDetails("Error en parseInitialData");
//            return null;
//        }
//
//        System.out.println("Server.initialDataOutput = " + gson.toJson(initialDataOutput, InitialDataOutput.class).toString());
//
//        System.out.println("Retornando ErrorCode = " + initialDataOutput.getErrorCode());
//        System.out.println("Retornando ErrorDetails = " + initialDataOutput.getErrorDetails());
//
//        return initialDataOutput;
//
//    }
//
//    /**
//     * Consume el servicio REST de Modipay memberPayment, que hace el pago de un
//     * miembro a otro.
//     *
//     * @author Juan Carlos Delgado P.
//     * @param codigoUsuario String con el codigo de usuario en Modipay.
//     * @param passwd String con la clave de Modipay.
//     * @param pMemberPaymentInputData MemberPaymentInputData Objeto con el
//     * miembro al que se le va a pagar, el monto y la descripción del pago.
//     * @return MemberPaymentOutput Objeto que contiene los jsonObjIns del pago
//     * retornado por el servicio memberPayment2.
//     */
//    public static MemberPaymentOutput memberPayment(String codigoUsuario, String passwd, MemberPaymentInputData pMemberPaymentInputData) {
//        Gson gson = new Gson();
//        MemberPaymentOutput memberPaymentOutput = new MemberPaymentOutput();
//        String jsonStrOut = "";
//
//        String strJson = gson.toJson(pMemberPaymentInputData, MemberPaymentInputData.class);
//        System.out.println("strJson" + strJson);
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        System.out.println("[JsonAuth.initialData] Conectando a:" + URL_Rest + "/payments/memberPayment");
//        HttpPost post = new HttpPost(URL_Rest + "/payments/memberPayment");
//
//        try {
//            post.setHeader("Content-Type", "application/json");
//            post.setHeader("Authorization", "Basic " + EncriptTool.encodeBase64(codigoUsuario + ":" + passwd));
//
//            StringEntity entity = new StringEntity(strJson);
//            post.setEntity(entity);
//
//            HttpResponse resp = httpClient.execute(post);
//            jsonStrOut = EntityUtils.toString(resp.getEntity());
//
//            memberPaymentOutput = gson.fromJson(jsonStrOut, MemberPaymentOutput.class);
//        } catch (IOException ex) {
//            jsonStrOut = ex.getMessage();
//
//            if (jsonStrOut.contains("Connection timed out")) {
//                memberPaymentOutput.setErrorCode(jsonStrOut);
//                memberPaymentOutput.setErrorDetails(URL_Rest + "/payments/memberPayment");
//            } else {
//                memberPaymentOutput = gson.fromJson(jsonStrOut, MemberPaymentOutput.class);
//            }
//        }
//
//        System.out.println("Server.MemberPaymentOutput = " + gson.toJson(memberPaymentOutput).toString());
//        return memberPaymentOutput;
//
//    }
//
//    /**
//     * Consume el servicio REST de Modipay confirmMemberPayment, que mira si ya
//     * se efectuó el pago.
//     *
//     * @author Juan Carlos Delgado P.
//     * @param codigoUsuario String con el codigo de usuario en Modipay.
//     * @param passwd String con la clave de Modipay.
//     * @param pMemberPaymentInputData MemberPaymentInputData Objeto con el
//     * miembro al que se le va a pagar, el monto y la descripción del pago.
//     * @return ConfirmMemberPaymentOutput Objeto que contiene los jsonObjIns de
//     * la confirmación del pago retornado por el servicio confirmMemberPayment2.
//     */
//    public static ConfirmMemberPaymentOutput confirmMemberPayment(String codigoUsuario, String passwd, MemberPaymentInputData pMemberPaymentInputData) {
//        Gson gson = new Gson();
//        ConfirmMemberPaymentOutput confirmMemberPaymentOutput = new ConfirmMemberPaymentOutput();
//
//        String strJson = gson.toJson(pMemberPaymentInputData, MemberPaymentInputData.class);
//        String jsonStrOut = "";
//        System.out.println("strJson" + strJson);
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        System.out.println("[JsonAuth.confirmMemberPayment] Conectando a:" + URL_Rest + "/payments/confirmMemberPayment");
//        HttpPost post = new HttpPost(URL_Rest + "/payments/confirmMemberPayment");
//
//
//        try {
//            post.setHeader("Content-Type", "application/json");
//            post.setHeader("Authorization", "Basic " + EncriptTool.encodeBase64(codigoUsuario + ":" + passwd));
//
//            StringEntity entity = new StringEntity(strJson);
//            post.setEntity(entity);
//
//            HttpResponse resp = httpClient.execute(post);
//            jsonStrOut = EntityUtils.toString(resp.getEntity());
//            confirmMemberPaymentOutput = gson.fromJson(jsonStrOut, ConfirmMemberPaymentOutput.class);
//               
//            
//
//        } catch (IOException ex) {
//            jsonStrOut = ex.getMessage();
//
//            if (jsonStrOut.contains("Connection timed out")) {
//                confirmMemberPaymentOutput.setErrorCode(jsonStrOut);
//                confirmMemberPaymentOutput.setErrorDetails(URL_Rest + "/payments/confirmMemberPayment");
//            } else {
//                confirmMemberPaymentOutput = gson.fromJson(jsonStrOut, ConfirmMemberPaymentOutput.class);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(JsonAuth.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("jsonStrOut = " + jsonStrOut);
//
//        return confirmMemberPaymentOutput;
//    }
//
//    /**
//     * Método que hace el parseo manual de un objeto Json a Java, debido a que
//     * en el servicio InitialData se usan palabras reservadas como default.
//     *
//     * @author Juan Carlos Delgado P.
//     * @param jsonObj JSONObject con el objeto Json, retornado por el servicio.
//     * @return InitialDataOutput Objeto Java con el parseo del objeto Json.
//     */
//    public static InitialDataOutput parseInitialData(JSONObject jsonObj) {
//        InitialDataOutput initialDataOutput = new InitialDataOutput();
//
//        try {
//            // Se poblan los tipos primitivos de InitialDataOutput
//            initialDataOutput.setRequireTransactionPassword(jsonObj.getBoolean("requireTransactionPassword"));
//            initialDataOutput.setCanMakeMemberPayments(jsonObj.getBoolean("canMakeMemberPayments"));
//            initialDataOutput.setCanMakeSystemPayments(jsonObj.getBoolean("canMakeSystemPayments"));
//            initialDataOutput.setDecimalCount(jsonObj.getInt("decimalCount"));
//            initialDataOutput.setDecimalSeparator(jsonObj.getString("decimalSeparator"));
//
//            // Profile
//            initialDataOutput.getProfile().setId(jsonObj.getJSONObject("profile").getInt("id"));
//            initialDataOutput.getProfile().setName(jsonObj.getJSONObject("profile").getString("name"));
//            initialDataOutput.getProfile().setUserName(jsonObj.getJSONObject("profile").getString("username"));
//            initialDataOutput.getProfile().setEmail(jsonObj.getJSONObject("profile").getString("email"));
//
//            // Profile.images
//            JSONArray resultArray = null;
//
//            try {
//                resultArray = jsonObj.getJSONObject("profile").getJSONArray("images");
//
//                for (int j = 0; j <= resultArray.length() - 1; j++) {
//                    Images images = new Images();
//                    //System.out.println(j + " images = " + resultArray.getString(j));                
//                    images.setId(resultArray.getJSONObject(j).getInt("id"));
//                    images.setCaption(resultArray.getJSONObject(j).getString("caption"));
//                    images.setThumbnailUrl(resultArray.getJSONObject(j).getString("thumbnailUrl"));
//                    images.setFullUrl(resultArray.getJSONObject(j).getString("fullUrl"));
//                    images.setLastModified(DateTools.convertDateFromJsonFormat(resultArray.getJSONObject(j).getString("lastModified")));
//                    //System.out.println(" images.setLastModified formateada = " + images.getLastModified());
//
//                    initialDataOutput.getProfile().getImages().add(images);
//                }
//            } catch (NoSuchElementException nsee) {
//                System.out.println("No existe la etiqueta Images.");
//            } catch (Exception je) {
//                System.out.println("No existe la etiqueta Images.");
//            }
//
//            // Profile.customValues
//            try {
//                resultArray = jsonObj.getJSONObject("profile").getJSONArray("customValues");
//
//                for (int k = 0; k <= resultArray.length() - 1; k++) {
//                    CustomValue customValue = new CustomValue();
//
//                    //System.out.println(k + " customValue = " + resultArray.getString(k));
//                    customValue.setInternalName(resultArray.getJSONObject(k).getString("internalName"));
//                    customValue.setFieldId(resultArray.getJSONObject(k).getInt("fieldId"));
//                    customValue.setDisplayName(resultArray.getJSONObject(k).getString("displayName"));
//                    customValue.setValue(resultArray.getJSONObject(k).getString("value"));
//
//                    if (resultArray.getJSONObject(k).has("possibleValueId")) {
//                        //System.out.println(k + " customValue.possibleValueId = " + resultArray.getJSONObject(k).getString("possibleValueId"));
//                        customValue.setPossibleValueId(resultArray.getJSONObject(k).getInt("possibleValueId"));
//                    } else {
//                        customValue.setPossibleValueId(null);
//                    }
//
//                    initialDataOutput.getProfile().getCustomValues().add(customValue);
//                }
//            } catch (NoSuchElementException nse) {
//                System.out.println("No existe la etiqueta customValues.");
//            } catch (Exception je) {
//                System.out.println("No existe la etiqueta customValues.");
//            }
//
//            // Accounts
//            resultArray = jsonObj.getJSONArray("accounts");
//
//            for (int i = 0; i <= resultArray.length() - 1; i++) {
//                Accounts account = new Accounts();
//                Type type = new Type();
//                Currency currency = new Currency();
//
//                //System.out.println(i + " accounts = " + resultArray.getString(i));                
//                account.setId(resultArray.getJSONObject(i).getInt("id"));
//                account.setPredeterminado(resultArray.getJSONObject(i).getBoolean("default"));
//
//                // Type
//                //System.out.println(i + " type = " + resultArray.getJSONObject(i).getJSONObject("type"));                
//                type.setId(resultArray.getJSONObject(i).getJSONObject("type").getInt("id"));
//                type.setName(resultArray.getJSONObject(i).getJSONObject("type").getString("name"));
//
//                // Currency
//                //System.out.println(i + " Currency = " + resultArray.getJSONObject(i).getJSONObject("type").getJSONObject("currency"));                
//                currency.setId(resultArray.getJSONObject(i).getJSONObject("type").getJSONObject("currency").getInt("id"));
//                currency.setSymbol(resultArray.getJSONObject(i).getJSONObject("type").getJSONObject("currency").getString("symbol"));
//                currency.setName(resultArray.getJSONObject(i).getJSONObject("type").getJSONObject("currency").getString("name"));
//
//                type.setCurrency(currency);
//                account.setType(type);
//                initialDataOutput.getAccounts().add(account);
//            }
//
//            System.out.println("Finaliza la conversión de la estructura JSON a Java");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//
//        return initialDataOutput;
//    }
//
//    /**
//     * Consume el servicio REST de Modipay Info, que retorna los saldos de las
//     * cuentas de un miembro
//     *
//     * @author Juan Carlos Delgado P.
//     * @param codigoUsuario String con el codigo de usuario en Modipay.
//     * @param passwd String con la clave de Modipay.
//     * @return InfoResponse Objeto que contiene los jsonObjIns de la consulta de
//     * un miembro retornado por el servicio info.
//     */
//    public static List<InfoResponse> info(String codigoUsuario, String passwd) {
//        List<InfoResponse> lstInfoResponse = new ArrayList<InfoResponse>();
//        Gson gson = new Gson();
//        String jsonStrOut = "";
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        System.out.println("[JsonAuth.initialData] Conectando a:" + URL_Rest + "/accounts/info");
//        HttpGet get = new HttpGet(URL_Rest + "/accounts/info");
//
//        try {
//            get.setHeader("Content-Type", "application/json");
//            get.setHeader("Authorization", "Basic " + EncriptTool.encodeBase64(codigoUsuario + ":" + passwd));
//
//            HttpResponse resp = httpClient.execute(get);
//            jsonStrOut = EntityUtils.toString(resp.getEntity());
//            jsonStrOut = "{\"info\":" + jsonStrOut + "}"; // Se arregla el json ya que viene mal formado
//
//            if (jsonStrOut != null) {
//                JSONObject jsonObj = new JSONObject(jsonStrOut);
//                if (jsonStrOut.contains("errorCode")) {
//                    lstInfoResponse.add(gson.fromJson(jsonStrOut, InfoResponse.class));
//                } else {
//                    JSONArray listInfo = jsonObj.getJSONArray("info");
//                    for (int i = 0; i < listInfo.length(); ++i) {
//                        JSONObject itemInfo = listInfo.getJSONObject(i);
//                        System.out.println("itemInfo = " + itemInfo);
//
//                        lstInfoResponse.add(parseInfo(itemInfo));
//                    }
//                }
//            } else {
//                return null;
//            }
//
//        } catch (IOException ex) {
//            jsonStrOut = ex.getMessage();
//
//            if (jsonStrOut.contains("Connection timed out")) {
//                InfoResponse infoResponseError = new InfoResponse();
//                infoResponseError.setErrorCode(jsonStrOut);
//                infoResponseError.setErrorDetails(URL_Rest + "/accounts/info");
//                lstInfoResponse.add(infoResponseError);
//            } else {
//                lstInfoResponse.add(gson.fromJson(jsonStrOut, InfoResponse.class));
//            }
//        } catch (ParseException ex) {
//            System.out.println("Error al utilizar el servicio initialData. " + ex.getMessage());
//            InfoResponse infoResponse = new InfoResponse();
//            infoResponse.setErrorCode("Error al Parsear Json");
//            infoResponse.setErrorDetails("Error en parseInitialData");
//            lstInfoResponse.add(infoResponse);
//            return lstInfoResponse;
//        }
//
//        System.out.println("jsonStrOut = " + jsonStrOut);
//
//        return lstInfoResponse;
//    }
//
//    /**
//     * Método que hace el parseo manual de un objeto Json a Java, debido a que
//     * en el servicio Info se usan palabras reservadas como default.
//     *
//     * @author Juan Carlos Delgado P.
//     * @param jsonObj JSONObject con el objeto Json, retornado por el servicio.
//     * @return InfoResponse Objeto Java con el parseo del objeto Json.
//     */
//    public static InfoResponse parseInfo(JSONObject jsonObj) {
//        InfoResponse infoResponse = new InfoResponse();
//
//        try {
//            // Account
//            Accounts account = new Accounts();
//            account.setId(jsonObj.getJSONObject("account").getInt("id"));
//            account.setPredeterminado(jsonObj.getJSONObject("account").getBoolean("default"));
//
//            // Account.Type
//            Type type = new Type();
//            type.setId(jsonObj.getJSONObject("account").getJSONObject("type").getInt("id"));
//            type.setName(jsonObj.getJSONObject("account").getJSONObject("type").getString("name"));
//
//            // Account.Type.Currency
//            Currency currency = new Currency();
//            currency.setId(jsonObj.getJSONObject("account").getJSONObject("type").getJSONObject("currency").getInt("id"));
//            currency.setSymbol(jsonObj.getJSONObject("account").getJSONObject("type").getJSONObject("currency").getString("symbol"));
//            currency.setName(jsonObj.getJSONObject("account").getJSONObject("type").getJSONObject("currency").getString("name"));
//
//            type.setCurrency(currency);
//            account.setType(type);
//            infoResponse.setAccount(account);
//
//            // Status
//            Status status = new Status();
//            status.setBalance(jsonObj.getJSONObject("status").getDouble("balance"));
//            status.setFormattedBalance(jsonObj.getJSONObject("status").getString("formattedBalance"));
//            status.setAvailableBalance(jsonObj.getJSONObject("status").getDouble("availableBalance"));
//            status.setFormattedAvailableBalance(jsonObj.getJSONObject("status").getString("formattedAvailableBalance"));
//            status.setReservedAmount(jsonObj.getJSONObject("status").getDouble("reservedAmount"));
//            status.setFormattedReservedAmount(jsonObj.getJSONObject("status").getString("formattedReservedAmount"));
//            status.setCreditLimit(jsonObj.getJSONObject("status").getDouble("creditLimit"));
//            status.setFormattedCreditLimit(jsonObj.getJSONObject("status").getString("formattedCreditLimit"));
//
//            infoResponse.setStatus(status);
//        } catch (NoSuchElementException e) {
//            System.out.println("Error al utilizar el servicio initialData. Parse" + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("Error al utilizar el servicio initialData. Parse" + e.getMessage());
//        } catch (ClassCastException e) {
//            System.out.println("Error al utilizar el servicio initialData. Parse" + e.getMessage());
//        }
//
//        return infoResponse;
//    }
//
//    /**
//     * Método que retorna los tipos de las cuentas asociados a un miembro.
//     *
//     * @author Juan Carlos Delgado P.
//     * @param codigoUsuario
//     * @param passwd
//     * @return List<Accounts> Lista con las cuentas del miembro loggeado
//     */
//    public static List<Accounts> consultarCuentasMiembro(String codigoUsuario, String passwd) {
//        List<Accounts> lstAccounts = new ArrayList<Accounts>();
//
//        Gson gson = new Gson();
//        String jsonStrOut = "";
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        HttpGet get = new HttpGet(URL_Rest + "/access/initialData");
//
//        try {
//            get.setHeader("Content-Type", "application/json");
//            get.setHeader("Authorization", "Basic " + EncriptTool.encodeBase64(codigoUsuario + ":" + passwd));
//
//            HttpResponse resp = httpClient.execute(get);
//            jsonStrOut = EntityUtils.toString(resp.getEntity());
//
//            JSONObject jsonObj = new JSONObject(jsonStrOut);
//
//            System.out.println("Cuentas String = " + jsonStrOut);
//
//            //
//            if (jsonStrOut.contains("errorCode")) {
//                System.out.println("erroCode:   " + jsonObj.get("errorCode"));
//
//                Accounts account = gson.fromJson(jsonStrOut, Accounts.class);
//                lstAccounts.add(account);
//
//            } else {
//
//                JSONArray resultArray = jsonObj.getJSONArray("accounts");
//
//                for (int i = 0; i <= resultArray.length() - 1; i++) {
//                    Accounts account = new Accounts();
//                    Type type = new Type();
//                    Currency currency = new Currency();
//
//                    // Accounts
//                    account.setId(resultArray.getJSONObject(i).getInt("id"));
//                    account.setPredeterminado(resultArray.getJSONObject(i).getBoolean("default"));
//
//                    // Type
//                    type.setId(resultArray.getJSONObject(i).getJSONObject("type").getInt("id"));
//                    type.setName(resultArray.getJSONObject(i).getJSONObject("type").getString("name"));
//
//                    // Currency
//                    currency.setId(resultArray.getJSONObject(i).getJSONObject("type").getJSONObject("currency").getInt("id"));
//                    currency.setSymbol(resultArray.getJSONObject(i).getJSONObject("type").getJSONObject("currency").getString("symbol"));
//                    currency.setName(resultArray.getJSONObject(i).getJSONObject("type").getJSONObject("currency").getString("name"));
//
//                    type.setCurrency(currency);
//                    account.setType(type);
//
//                    lstAccounts.add(account);
//                }
//            }
//        } catch (IOException ex) {
//            System.out.println("Error al utilizar el servicio consultarCuentasMiembro. " + ex);
//            jsonStrOut = ex.getMessage();
//            ex.printStackTrace();
//        } catch (ParseException ex) {
//            System.out.println("Error al utilizar el servicio consultarCuentasMiembro. " + ex);
//            ex.printStackTrace();
//        }
//
//        return lstAccounts;
//    }
//
//    /**
//     * Consume el servicio Rest Info, y retorna el saldo de la cuenta dada.
//     *
//     * @author Juan Carlos Delgado P.
//     * @param usuario String usuario ModiPay
//     * @param passwd String Contrasena Modipay
//     * @param nombreCuenta String Nombre de la cuenta de la que se quiere
//     * consultar saldo
//     * @return saldo double Saldo de la cuenta dada
//     * @throws java.lang.Exception cuando la cuenta no existe
//     *
//     */
//    public static double consultarSaldoCuenta(String usuario, String passwd, String nombreCuenta) throws Exception {
//        double saldo = -1;
//
//        List<InfoResponse> lstCuentas = info(usuario, passwd);
//
//        for (InfoResponse infoResponse : lstCuentas) {
//            if (infoResponse.getAccount().getType().getName().equals(nombreCuenta)) {
//                saldo = infoResponse.getStatus().getAvailableBalance();
//            }
//        }
//
//        if (saldo == -1) {
//            throw new Exception("No existe la cuenta " + nombreCuenta + " para el usuario " + usuario);
//        }
//
//        return saldo;
//    }
//
//    /**
//     * Consume el servicio REST de Modipay systemPayment, que hace el pago de un
//     * miembro a una cuenta del sistema
//     *
//     * @author Juan Carlos Delgado P.
//     * @param codigoUsuario String con el codigo de usuario en Modipay.
//     * @param passwd String con la clave de Modipay.
//     * @param pMemberPaymentInputData MemberPaymentInputData Objeto con el
//     * miembro al que se le va a pagar, el monto y la descripción del pago.
//     * @return MemberPaymentOutput Objeto que contiene los jsonObjIns del pago
//     * retornado por el servicio memberPayment2.
//     */
//    public static MemberPaymentOutput systemPayment(String codigoUsuario, String passwd, MemberPaymentInputData pMemberPaymentInputData) {
//        Gson gson = new Gson();
//        MemberPaymentOutput memberPaymentOutput = new MemberPaymentOutput();
//        String strJson = gson.toJson(pMemberPaymentInputData, MemberPaymentInputData.class);
//        String jsonStrOut = "";
//        System.out.println("strJson" + strJson);
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        System.out.println("[JsonAuth.systemPayment] Conectando a:" + URL_Rest + "/payments/systemPayment");
//        HttpPost post = new HttpPost(URL_Rest + "/payments/systemPayment");
//
//        try {
//            post.setHeader("Content-Type", "application/json");
//            post.setHeader("Authorization", "Basic " + EncriptTool.encodeBase64(codigoUsuario + ":" + passwd));
//
//            StringEntity entity = new StringEntity(strJson);
//            post.setEntity(entity);
//
//            HttpResponse resp = httpClient.execute(post);
//            jsonStrOut = EntityUtils.toString(resp.getEntity());
//
//            memberPaymentOutput = gson.fromJson(jsonStrOut, MemberPaymentOutput.class);
//        } catch (IOException ex) {
//            jsonStrOut = ex.getMessage();
//
//            if (jsonStrOut.contains("Connection timed out")) {
//                memberPaymentOutput.setErrorCode(jsonStrOut);
//                memberPaymentOutput.setErrorDetails(URL_Rest + "/payments/memberPayment");
//            } else {
//                memberPaymentOutput = gson.fromJson(jsonStrOut, MemberPaymentOutput.class);
//            }
//        }
//
//        System.out.println("Server.MemberPaymentOutput = " + gson.toJson(memberPaymentOutput).toString());
//        return memberPaymentOutput;
//
//    }
//
//    /**
//     * Consume el servicio REST de Modipay confirmSystemPayment, que mira si ya
//     * se efectuó el pago de una cuenta a una cuenta del sistema.
//     *
//     * @author Juan Carlos Delgado P.
//     * @param codigoUsuario String con el codigo de usuario en Modipay.
//     * @param passwd String con la clave de Modipay.
//     * @param pMemberPaymentInputData MemberPaymentInputData Objeto con el
//     * miembro al que se le va a pagar, el monto y la descripción del pago.
//     * @return ConfirmMemberPaymentOutput Objeto que contiene los jsonObjIns de
//     * la confirmación del pago retornado por el servicio confirmMemberPayment2.
//     */
//    public static ConfirmMemberPaymentOutput confirmSystemPayment(String codigoUsuario, String passwd, MemberPaymentInputData pMemberPaymentInputData) {
//        Gson gson = new Gson();
//        ConfirmMemberPaymentOutput confirmMemberPaymentOutput = new ConfirmMemberPaymentOutput();
//        String strJson = gson.toJson(pMemberPaymentInputData, MemberPaymentInputData.class);
//        String jsonStrOut = "";
//        System.out.println("strJson" + strJson);
//
//        HttpClient httpClient = new DefaultHttpClient();
//
//        System.out.println("[JsonAuth.initialData] Conectando a:" + URL_Rest + "/payments/confirmSystemPayment");
//        HttpPost post = new HttpPost(URL_Rest + "/payments/confirmSystemPayment");
//
//        try {
//
//            post.setHeader("Content-Type", "application/json");
//            post.setHeader("Authorization", "Basic " + EncriptTool.encodeBase64(codigoUsuario + ":" + passwd));
//
//            StringEntity entity = new StringEntity(strJson);
//            post.setEntity(entity);
//
//            HttpResponse resp = httpClient.execute(post);
//            jsonStrOut = EntityUtils.toString(resp.getEntity());
//            confirmMemberPaymentOutput = gson.fromJson(jsonStrOut, ConfirmMemberPaymentOutput.class);
//        } catch (IOException ex) {
//            jsonStrOut = ex.getMessage();
//
//            if (jsonStrOut.contains("Connection timed out")) {
//                confirmMemberPaymentOutput.setErrorCode(jsonStrOut);
//                confirmMemberPaymentOutput.setErrorDetails(URL_Rest + "/payments/confirmMemberPayment");
//            } else {
//                confirmMemberPaymentOutput = gson.fromJson(jsonStrOut, ConfirmMemberPaymentOutput.class);
//            }
//        }
//
//        System.out.println("jsonStrOut = " + jsonStrOut);
//
//        return confirmMemberPaymentOutput;
//    }
//}