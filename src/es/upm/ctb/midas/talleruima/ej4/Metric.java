

/* First created by JCasGen Thu Sep 10 13:22:39 CEST 2015 */
package es.upm.ctb.midas.talleruima.ej4;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import es.upm.ctb.midas.talleruima.ej2.Number;
import es.upm.ctb.midas.talleruima.ej3.Unit;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Sep 10 17:16:46 CEST 2015
 * XML source: /Volumes/Data/work/ws-nlp-es/tallerUIMA/desc/ej5/MetricsAnnotatorPipeline.xml
 * @generated */
public class Metric extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Metric.class);
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
  protected Metric() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Metric(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Metric(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Metric(JCas jcas, int begin, int end) {
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
  //* Feature: number

  /** getter for number - gets 
   * @generated
   * @return value of the feature 
   */
  public Number getNumber() {
    if (Metric_Type.featOkTst && ((Metric_Type)jcasType).casFeat_number == null)
      jcasType.jcas.throwFeatMissing("number", "es.upm.ctb.midas.talleruima.ej4.Metric");
    return (Number)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Metric_Type)jcasType).casFeatCode_number)));}
    
  /** setter for number - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumber(Number v) {
    if (Metric_Type.featOkTst && ((Metric_Type)jcasType).casFeat_number == null)
      jcasType.jcas.throwFeatMissing("number", "es.upm.ctb.midas.talleruima.ej4.Metric");
    jcasType.ll_cas.ll_setRefValue(addr, ((Metric_Type)jcasType).casFeatCode_number, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: unit

  /** getter for unit - gets 
   * @generated
   * @return value of the feature 
   */
  public Unit getUnit() {
    if (Metric_Type.featOkTst && ((Metric_Type)jcasType).casFeat_unit == null)
      jcasType.jcas.throwFeatMissing("unit", "es.upm.ctb.midas.talleruima.ej4.Metric");
    return (Unit)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Metric_Type)jcasType).casFeatCode_unit)));}
    
  /** setter for unit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnit(Unit v) {
    if (Metric_Type.featOkTst && ((Metric_Type)jcasType).casFeat_unit == null)
      jcasType.jcas.throwFeatMissing("unit", "es.upm.ctb.midas.talleruima.ej4.Metric");
    jcasType.ll_cas.ll_setRefValue(addr, ((Metric_Type)jcasType).casFeatCode_unit, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    