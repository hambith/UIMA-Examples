
/* First created by JCasGen Thu Sep 10 13:22:39 CEST 2015 */
package es.upm.ctb.midas.talleruima.ej4;

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
 * Updated by JCasGen Thu Sep 10 17:16:46 CEST 2015
 * @generated */
public class Metric_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Metric_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Metric_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Metric(addr, Metric_Type.this);
  			   Metric_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Metric(addr, Metric_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Metric.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("es.upm.ctb.midas.talleruima.ej4.Metric");
 
  /** @generated */
  final Feature casFeat_number;
  /** @generated */
  final int     casFeatCode_number;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNumber(int addr) {
        if (featOkTst && casFeat_number == null)
      jcas.throwFeatMissing("number", "es.upm.ctb.midas.talleruima.ej4.Metric");
    return ll_cas.ll_getRefValue(addr, casFeatCode_number);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNumber(int addr, int v) {
        if (featOkTst && casFeat_number == null)
      jcas.throwFeatMissing("number", "es.upm.ctb.midas.talleruima.ej4.Metric");
    ll_cas.ll_setRefValue(addr, casFeatCode_number, v);}
    
  
 
  /** @generated */
  final Feature casFeat_unit;
  /** @generated */
  final int     casFeatCode_unit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getUnit(int addr) {
        if (featOkTst && casFeat_unit == null)
      jcas.throwFeatMissing("unit", "es.upm.ctb.midas.talleruima.ej4.Metric");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnit(int addr, int v) {
        if (featOkTst && casFeat_unit == null)
      jcas.throwFeatMissing("unit", "es.upm.ctb.midas.talleruima.ej4.Metric");
    ll_cas.ll_setRefValue(addr, casFeatCode_unit, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Metric_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_number = jcas.getRequiredFeatureDE(casType, "number", "es.upm.ctb.midas.talleruima.ej2.Number", featOkTst);
    casFeatCode_number  = (null == casFeat_number) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_number).getCode();

 
    casFeat_unit = jcas.getRequiredFeatureDE(casType, "unit", "es.upm.ctb.midas.talleruima.ej3.Unit", featOkTst);
    casFeatCode_unit  = (null == casFeat_unit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unit).getCode();

  }
}



    