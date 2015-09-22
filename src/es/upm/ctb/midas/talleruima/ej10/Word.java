

/* First created by JCasGen Fri Sep 11 09:47:16 CEST 2015 */
package es.upm.ctb.midas.talleruima.ej10;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Sep 11 10:20:11 CEST 2015
 * XML source: /Volumes/Data/work/ws-nlp-es/tallerUIMA/desc/ej10/WordAnnotator.xml
 * @generated */
public class Word extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Word.class);
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
  protected Word() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Word(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Word(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Word(JCas jcas, int begin, int end) {
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
  //* Feature: vowels

  /** getter for vowels - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getVowels() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_vowels == null)
      jcasType.jcas.throwFeatMissing("vowels", "es.upm.ctb.midas.talleruima.ej10.Word");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Word_Type)jcasType).casFeatCode_vowels)));}
    
  /** setter for vowels - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVowels(StringArray v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_vowels == null)
      jcasType.jcas.throwFeatMissing("vowels", "es.upm.ctb.midas.talleruima.ej10.Word");
    jcasType.ll_cas.ll_setRefValue(addr, ((Word_Type)jcasType).casFeatCode_vowels, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for vowels - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getVowels(int i) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_vowels == null)
      jcasType.jcas.throwFeatMissing("vowels", "es.upm.ctb.midas.talleruima.ej10.Word");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Word_Type)jcasType).casFeatCode_vowels), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Word_Type)jcasType).casFeatCode_vowels), i);}

  /** indexed setter for vowels - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVowels(int i, String v) { 
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_vowels == null)
      jcasType.jcas.throwFeatMissing("vowels", "es.upm.ctb.midas.talleruima.ej10.Word");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Word_Type)jcasType).casFeatCode_vowels), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Word_Type)jcasType).casFeatCode_vowels), i, v);}
   
    
  //*--------------*
  //* Feature: consonants

  /** getter for consonants - gets 
   * @generated
   * @return value of the feature 
   */
  public StringList getConsonants() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_consonants == null)
      jcasType.jcas.throwFeatMissing("consonants", "es.upm.ctb.midas.talleruima.ej10.Word");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Word_Type)jcasType).casFeatCode_consonants)));}
    
  /** setter for consonants - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConsonants(StringList v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_consonants == null)
      jcasType.jcas.throwFeatMissing("consonants", "es.upm.ctb.midas.talleruima.ej10.Word");
    jcasType.ll_cas.ll_setRefValue(addr, ((Word_Type)jcasType).casFeatCode_consonants, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    