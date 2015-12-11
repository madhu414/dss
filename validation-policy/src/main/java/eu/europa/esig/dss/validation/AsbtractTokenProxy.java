package eu.europa.esig.dss.validation;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import eu.europa.esig.dss.jaxb.diagnostic.XmlBasicSignatureType;
import eu.europa.esig.dss.jaxb.diagnostic.XmlCertificateChainType;
import eu.europa.esig.dss.jaxb.diagnostic.XmlChainCertificate;
import eu.europa.esig.dss.jaxb.diagnostic.XmlSigningCertificateType;

public abstract class AsbtractTokenProxy implements TokenProxy {

	protected abstract XmlBasicSignatureType getCurrentBasicSignature();

	protected abstract XmlCertificateChainType getCurrentCertificateChain();

	protected abstract XmlSigningCertificateType getCurrentSigningCertificate();

	@Override
	public List<XmlChainCertificate> getCertificateChain() {
		return getCurrentCertificateChain().getChainCertificate();
	}

	@Override
	public boolean isReferenceDataFound() {
		return getCurrentBasicSignature().isReferenceDataFound();
	}

	@Override
	public boolean isReferenceDataIntact() {
		return getCurrentBasicSignature().isReferenceDataIntact();
	}

	@Override
	public boolean isSignatureIntact() {
		return getCurrentBasicSignature().isSignatureIntact();
	}

	@Override
	public boolean isSignatureValid() {
		return getCurrentBasicSignature().isSignatureValid();
	}

	@Override
	public String getDigestAlgoUsedToSignThisToken() {
		return getCurrentBasicSignature().getDigestAlgoUsedToSignThisToken();
	}

	@Override
	public String getEncryptionAlgoUsedToSignThisToken() {
		return getCurrentBasicSignature().getEncryptionAlgoUsedToSignThisToken();
	}

	@Override
	public String getKeyLengthUsedToSignThisToken() {
		return getCurrentBasicSignature().getKeyLengthUsedToSignThisToken();
	}

	@Override
	public boolean isIssuerSerialMatch() {
		XmlSigningCertificateType currentSigningCertificate = getCurrentSigningCertificate();
		return (currentSigningCertificate != null) && currentSigningCertificate.isIssuerSerialMatch();
	}

	@Override
	public boolean isAttributePresent() {
		XmlSigningCertificateType currentSigningCertificate = getCurrentSigningCertificate();
		return (currentSigningCertificate != null) && currentSigningCertificate.isAttributePresent();
	}

	@Override
	public boolean isDigestValueMatch() {
		XmlSigningCertificateType currentSigningCertificate = getCurrentSigningCertificate();
		return (currentSigningCertificate != null) && currentSigningCertificate.isDigestValueMatch();
	}

	@Override
	public boolean isDigestValuePresent() {
		XmlSigningCertificateType currentSigningCertificate = getCurrentSigningCertificate();
		return (currentSigningCertificate != null) && currentSigningCertificate.isDigestValuePresent();
	}

	@Override
	public String getSigningCertificateId() {
		XmlSigningCertificateType currentSigningCertificate = getCurrentSigningCertificate();
		if (currentSigningCertificate != null) {
			return currentSigningCertificate.getId();
		}
		return StringUtils.EMPTY;
	}

	@Override
	public String getSigningCertificateSigned() {
		XmlSigningCertificateType currentSigningCertificate = getCurrentSigningCertificate();
		if (currentSigningCertificate != null) {
			return currentSigningCertificate.getSigned();
		}
		return StringUtils.EMPTY;
	}

	@Override
	public String getLastChainCertificateId() {
		XmlChainCertificate item = getLastChainCertificate();
		return item == null ? StringUtils.EMPTY : item.getId();
	}

	@Override
	public String getFirstChainCertificateId() {
		XmlChainCertificate item = getFirstChainCertificate();
		return item == null ? StringUtils.EMPTY : item.getId();
	}

	@Override
	public String getLastChainCertificateSource() {
		XmlChainCertificate item = getLastChainCertificate();
		return item == null ? StringUtils.EMPTY : item.getSource();
	}

	public XmlChainCertificate getLastChainCertificate() {
		XmlCertificateChainType certificateChain = getCurrentCertificateChain();
		if ((certificateChain != null) && CollectionUtils.isNotEmpty(certificateChain.getChainCertificate())) {
			List<XmlChainCertificate> list = certificateChain.getChainCertificate();
			XmlChainCertificate lastItem = list.get(list.size() - 1);
			return lastItem;
		}
		return null;
	}

	public XmlChainCertificate getFirstChainCertificate() {
		XmlCertificateChainType certificateChain = getCurrentCertificateChain();
		if ((certificateChain != null) && CollectionUtils.isNotEmpty(certificateChain.getChainCertificate())) {
			List<XmlChainCertificate> list = certificateChain.getChainCertificate();
			return list.get(0);
		}
		return null;
	}
}
