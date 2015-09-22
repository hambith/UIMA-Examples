
/* First created by JCasGen Fri Sep 11 09:47:16 CEST 2015 */
package es.upm.ctb.midas.talleruima.ej10;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Sep 11 10:20:11 CEST 2015
 * @generated */
public class Word_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Word_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Word_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Word(addr, Word_Type.this);
  			   Word_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Word(addr, Word_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Word.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("es.upm.ctb.midas.talleruima.ej10.Word");
 
  /** @generated */
  final Feature casFeat_vowels;
  /** @generated */
  final int     casFeatCode_vowels;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVowels(int addr) {
        if (featOkTst && casFeat_vowels == null)
      jcas.throwFeatMissing("vowels", "es.upm.ctb.midas.talleruima.ej10.Word");
    return ll_cas.ll_getRefValue(addr, casFeatCode_vowels);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVowels(int addr, int v) {
        if (featOkTst && casFeat_vowels == null)
      jcas.throwFeatMissing("vowels", "es.upm.ctb.midas.talleruima.ej10.Word");
    ll_cas.ll_setRefValue(addr, casFeatCode_vowels, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getVowels(int addr, int i) {
        if (featOkTst && casFeat_vowels == null)
      jcas.throwFeatMissing("vowels", "es.upm.ctb.midas.talleruima.ej10.Word");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vowels), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vowels), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vowels), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setVowels(int addr, int i, String v) {
        if (featOkTst && casFeat_vowels == null)
      jcas.throwFeatMissing("vowels", "es.upm.ctb.midas.talleruima.ej10.Word");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vowels), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vowels), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vowels), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_consonants;
  /** @generated */
  final int     casFeatCode_consonants;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getConsonants(int addr) {
        if (featOkTst && casFeat_consonants == null)
      jcas.throwFeatMissing("consonants", "es.upm.ctb.midas.talleruima.ej10.Word");
    return ll_cas.ll_getRefValue(addr, casFeatCode_consonants);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConsonants(int addr, int v) {
        if (featOkTst && casFeat_consonants == null)
      jcas.throwFeatMissing("consonants", "es.upm.ctb.midas.talleruima.ej10.Word");
    ll_cas.ll_setRefValue(addr, casFeatCode_consonants, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Word_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_vowels = jcas.getRequiredFeatureDE(casType, "vowels", "uima.cas.StringArray", featOkTst);
    casFeatCode_vowels  = (null == casFeat_vowels) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vowels).getCode();

 
    casFeat_consonants = jcas.getRequiredFeatureDE(casType, "consonants", "uima.cas.StringList", featOkTst);
    casFeatCode_consonants  = (null == casFeat_consonants) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_consonants).getCode();

  }
}



    