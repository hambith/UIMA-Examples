

/* First created by JCasGen Thu Sep 10 09:56:40 CEST 2015 */
package es.upm.ctb.midas.talleruima.ej1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Sep 10 11:40:07 CEST 2015
 * XML source: /Volumes/Data/work/ws-nlp-es/tallerUIMA/desc/ej1/numberDescriptor.xml
 * @generated */
public class Number extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Number.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Number() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Number(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Number(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Number(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: absoluteIntegerValue

  /** getter for absoluteIntegerValue - gets 
   * @generated
   * @return value of the feature 
   */
  public int getAbsoluteIntegerValue() {
    if (Number_Type.featOkTst && ((Number_Type)jcasType).casFeat_absoluteIntegerValue == null)
      jcasType.jcas.throwFeatMissing("absoluteIntegerValue", "es.upm.ctb.midas.talleruima.ej1.Number");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Number_Type)jcasType).casFeatCode_absoluteIntegerValue);}
    
  /** setter for absoluteIntegerValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAbsoluteIntegerValue(int v) {
    if (Number_Type.featOkTst && ((Number_Type)jcasType).casFeat_absoluteIntegerValue == null)
      jcasType.jcas.throwFeatMissing("absoluteIntegerValue", "es.upm.ctb.midas.talleruima.ej1.Number");
    jcasType.ll_cas.ll_setIntValue(addr, ((Number_Type)jcasType).casFeatCode_absoluteIntegerValue, v);}    
   
    
  //*--------------*
  //* Feature: absoluteDoubleValue

  /** getter for absoluteDoubleValue - gets 
   * @generated
   * @return value of the feature 
   */
  public double getAbsoluteDoubleValue() {
    if (Number_Type.featOkTst && ((Number_Type)jcasType).casFeat_absoluteDoubleValue == null)
      jcasType.jcas.throwFeatMissing("absoluteDoubleValue", "es.upm.ctb.midas.talleruima.ej1.Number");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Number_Type)jcasType).casFeatCode_absoluteDoubleValue);}
    
  /** setter for absoluteDoubleValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAbsoluteDoubleValue(double v) {
    if (Number_Type.featOkTst && ((Number_Type)jcasType).casFeat_absoluteDoubleValue == null)
      jcasType.jcas.throwFeatMissing("absoluteDoubleValue", "es.upm.ctb.midas.talleruima.ej1.Number");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Number_Type)jcasType).casFeatCode_absoluteDoubleValue, v);}    
   
    
  //*--------------*
  //* Feature: isDouble

  /** getter for isDouble - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsDouble() {
    if (Number_Type.featOkTst && ((Number_Type)jcasType).casFeat_isDouble == null)
      jcasType.jcas.throwFeatMissing("isDouble", "es.upm.ctb.midas.talleruima.ej1.Number");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Number_Type)jcasType).casFeatCode_isDouble);}
    
  /** setter for isDouble - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsDouble(boolean v) {
    if (Number_Type.featOkTst && ((Number_Type)jcasType).casFeat_isDouble == null)
      jcasType.jcas.throwFeatMissing("isDouble", "es.upm.ctb.midas.talleruima.ej1.Number");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Number_Type)jcasType).casFeatCode_isDouble, v);}    
   
    
  //*--------------*
  //* Feature: sign

  /** getter for sign - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSign() {
    if (Number_Type.featOkTst && ((Number_Type)jcasType).casFeat_sign == null)
      jcasType.jcas.throwFeatMissing("sign", "es.upm.ctb.midas.talleruima.ej1.Number");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Number_Type)jcasType).casFeatCode_sign);}
    
  /** setter for sign - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSign(int v) {
    if (Number_Type.featOkTst && ((Number_Type)jcasType).casFeat_sign == null)
      jcasType.jcas.throwFeatMissing("sign", "es.upm.ctb.midas.talleruima.ej1.Number");
    jcasType.ll_cas.ll_setIntValue(addr, ((Number_Type)jcasType).casFeatCode_sign, v);}    
  }

    