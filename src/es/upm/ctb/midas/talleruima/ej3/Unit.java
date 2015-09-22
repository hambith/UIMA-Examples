

/* First created by JCasGen Thu Sep 10 12:05:50 CEST 2015 */
package es.upm.ctb.midas.talleruima.ej3;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Sep 10 17:16:46 CEST 2015
 * XML source: /Volumes/Data/work/ws-nlp-es/tallerUIMA/desc/ej5/MetricsAnnotatorPipeline.xml
 * @generated */
public class Unit extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Unit.class);
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
  protected Unit() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Unit(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Unit(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Unit(JCas jcas, int begin, int end) {
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
  //* Feature: unit

  /** getter for unit - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUnit() {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_unit == null)
      jcasType.jcas.throwFeatMissing("unit", "es.upm.ctb.midas.talleruima.ej3.Unit");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Unit_Type)jcasType).casFeatCode_unit);}
    
  /** setter for unit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnit(String v) {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_unit == null)
      jcasType.jcas.throwFeatMissing("unit", "es.upm.ctb.midas.talleruima.ej3.Unit");
    jcasType.ll_cas.ll_setStringValue(addr, ((Unit_Type)jcasType).casFeatCode_unit, v);}    
   
    
  //*--------------*
  //* Feature: baseUnit

  /** getter for baseUnit - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBaseUnit() {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_baseUnit == null)
      jcasType.jcas.throwFeatMissing("baseUnit", "es.upm.ctb.midas.talleruima.ej3.Unit");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Unit_Type)jcasType).casFeatCode_baseUnit);}
    
  /** setter for baseUnit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBaseUnit(String v) {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_baseUnit == null)
      jcasType.jcas.throwFeatMissing("baseUnit", "es.upm.ctb.midas.talleruima.ej3.Unit");
    jcasType.ll_cas.ll_setStringValue(addr, ((Unit_Type)jcasType).casFeatCode_baseUnit, v);}    
   
    
  //*--------------*
  //* Feature: multiplier

  /** getter for multiplier - gets 
   * @generated
   * @return value of the feature 
   */
  public double getMultiplier() {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_multiplier == null)
      jcasType.jcas.throwFeatMissing("multiplier", "es.upm.ctb.midas.talleruima.ej3.Unit");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Unit_Type)jcasType).casFeatCode_multiplier);}
    
  /** setter for multiplier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMultiplier(double v) {
    if (Unit_Type.featOkTst && ((Unit_Type)jcasType).casFeat_multiplier == null)
      jcasType.jcas.throwFeatMissing("multiplier", "es.upm.ctb.midas.talleruima.ej3.Unit");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Unit_Type)jcasType).casFeatCode_multiplier, v);}    
  }

    