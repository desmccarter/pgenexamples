package com.dmcc.sample.pages.hsbc;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.sample.pages.hsbc.HsbcField;
import com.dmcc.pagegen.page.mccarterp.McCarterPage;

public class HsbcPage extends McCarterPage{

private final String url="https://www.hsbc.co.uk";
private final String rRoot="../pgenexamples/src/test/resources";

	public HsbcPage navigate()throws PageException {
		this.setResourcesRoot(rRoot);
		this.navigate(url);
		return this;
	}

	public void setUserid(final String value) throws PageException{
		this.setValue(HsbcField.Userid, value);
	}

	public void clickUserid()throws PageException{
		this.click(HsbcField.Userid);
	}

	public void clickCookieuserid()throws PageException{
		this.click(HsbcField.Cookieuserid);
	}

	public void setIdSession(final String value) throws PageException{
		this.setValue(HsbcField.IdSession, value);
	}

	public void clickIdSession()throws PageException{
		this.click(HsbcField.IdSession);
	}

	public void clickCheckbox()throws PageException{
		this.click(HsbcField.Checkbox);
	}

	public void setQueryString(final String value) throws PageException{
		this.setValue(HsbcField.QueryString, value);
	}

	public void clickQueryString()throws PageException{
		this.click(HsbcField.QueryString);
	}

	public void clickStartSearch()throws PageException{
		this.click(HsbcField.StartSearch);
	}

	public void clickCloseMenu()throws PageException{
		this.click(HsbcField.CloseMenu);
	}

	public void clickFermerCob1()throws PageException{
		this.click(HsbcField.FermerCob1);
	}

	public void clickFermerCob2()throws PageException{
		this.click(HsbcField.FermerCob2);
	}

	public void clickFermerCob3()throws PageException{
		this.click(HsbcField.FermerCob3);
	}

	public void clickFermerCob4()throws PageException{
		this.click(HsbcField.FermerCob4);
	}

	public void clickPersonal()throws PageException{
		this.click(HsbcField.Personal);
	}

	public void clickBusiness()throws PageException{
		this.click(HsbcField.Business);
	}

	public void clickLogOn()throws PageException{
		this.click(HsbcField.LogOn);
	}

	public void clickLogOut()throws PageException{
		this.click(HsbcField.LogOut);
	}

	public void clickHSBCPremierAccount()throws PageException{
		this.click(HsbcField.HSBCPremierAccount);
	}

	public void clickHSBCAdvanceAccount()throws PageException{
		this.click(HsbcField.HSBCAdvanceAccount);
	}

	public void clickHSBCStudentAccount()throws PageException{
		this.click(HsbcField.HSBCStudentAccount);
	}

	public void clickBankAccount()throws PageException{
		this.click(HsbcField.BankAccount);
	}

	public void clickSwitchingToHSBC()throws PageException{
		this.click(HsbcField.SwitchingToHSBC);
	}

	public void clickViewAll()throws PageException{
		this.click(HsbcField.ViewAll);
	}

	public void clickISAs()throws PageException{
		this.click(HsbcField.ISAs);
	}

	public void clickOnlineBonusSaver()throws PageException{
		this.click(HsbcField.OnlineBonusSaver);
	}

	public void clickFlexibleSaver()throws PageException{
		this.click(HsbcField.FlexibleSaver);
	}

	public void click32MonthBalanceTransferCreditCard()throws PageException{
		this.click(HsbcField.VALUE_OF_32MonthBalanceTransferCreditCard);
	}

	public void clickAdvanceCreditCard()throws PageException{
		this.click(HsbcField.AdvanceCreditCard);
	}

	public void clickDualCreditCard()throws PageException{
		this.click(HsbcField.DualCreditCard);
	}

	public void clickClassicCreditCard()throws PageException{
		this.click(HsbcField.ClassicCreditCard);
	}

	public void clickPremierCreditCard()throws PageException{
		this.click(HsbcField.PremierCreditCard);
	}

	public void clickPremierWorldEliteMastercard()throws PageException{
		this.click(HsbcField.PremierWorldEliteMastercard);
	}

	public void clickStudentCreditCard()throws PageException{
		this.click(HsbcField.StudentCreditCard);
	}

	public void clickWaysToBank()throws PageException{
		this.click(HsbcField.WaysToBank);
	}

	public void clickVoiceID()throws PageException{
		this.click(HsbcField.VoiceID);
	}

	public void clickContactAmpSupport()throws PageException{
		this.click(HsbcField.ContactAmpSupport);
	}

	public void clickFindABranch()throws PageException{
		this.click(HsbcField.FindABranch);
	}

	public void clickHSBCCurrencyAccount()throws PageException{
		this.click(HsbcField.HSBCCurrencyAccount);
	}

	public void clickInternationalPayments()throws PageException{
		this.click(HsbcField.InternationalPayments);
	}

	public void clickTravelMoney()throws PageException{
		this.click(HsbcField.TravelMoney);
	}

	public void clickPersonalLoan()throws PageException{
		this.click(HsbcField.PersonalLoan);
	}

	public void clickCarLoan()throws PageException{
		this.click(HsbcField.CarLoan);
	}

	public void clickFlexiloan()throws PageException{
		this.click(HsbcField.Flexiloan);
	}

	public void clickPremierPersonalLoan()throws PageException{
		this.click(HsbcField.PremierPersonalLoan);
	}

	public void clickGraduateLoan()throws PageException{
		this.click(HsbcField.GraduateLoan);
	}

	public void clickFirstTimeBuyer()throws PageException{
		this.click(HsbcField.FirstTimeBuyer);
	}

	public void clickRemortgage()throws PageException{
		this.click(HsbcField.Remortgage);
	}

	public void clickBuyToLet()throws PageException{
		this.click(HsbcField.BuyToLet);
	}

	public void clickExistingHomeowner()throws PageException{
		this.click(HsbcField.ExistingHomeowner);
	}

	public void clickMortgageRates()throws PageException{
		this.click(HsbcField.MortgageRates);
	}

	public void clickArmedForcesPersonnel()throws PageException{
		this.click(HsbcField.ArmedForcesPersonnel);
	}

	public void clickHelpAmpSupport()throws PageException{
		this.click(HsbcField.HelpAmpSupport);
	}

	public void clickMoneyWorries()throws PageException{
		this.click(HsbcField.MoneyWorries);
	}

	public void clickMortgageCalculator()throws PageException{
		this.click(HsbcField.MortgageCalculator);
	}

	public void clickOverpaymentCalculator()throws PageException{
		this.click(HsbcField.OverpaymentCalculator);
	}

	public void clickRepaymentCalculator()throws PageException{
		this.click(HsbcField.RepaymentCalculator);
	}

	public void clickBaseRateInformation()throws PageException{
		this.click(HsbcField.BaseRateInformation);
	}

	public void clickInvestmentFunds()throws PageException{
		this.click(HsbcField.InvestmentFunds);
	}

	public void clickWorldSelectionISA()throws PageException{
		this.click(HsbcField.WorldSelectionISA);
	}

	public void clickSharedealing()throws PageException{
		this.click(HsbcField.Sharedealing);
	}

	public void clickHSBCPremierFinancialAdvice()throws PageException{
		this.click(HsbcField.HSBCPremierFinancialAdvice);
	}

	public void clickHSBCStandAloneInvestmentAdvice()throws PageException{
		this.click(HsbcField.HSBCStandAloneInvestmentAdvice);
	}

	public void clickHSBCOnshoreInvestmentBond()throws PageException{
		this.click(HsbcField.HSBCOnshoreInvestmentBond);
	}

	public void clickChildTrustFund()throws PageException{
		this.click(HsbcField.ChildTrustFund);
	}

	public void clickFindOutMore()throws PageException{
		this.click(HsbcField.FindOutMore);
	}

	public void clickLogOnToGlobalInvestmentCentre()throws PageException{
		this.click(HsbcField.LogOnToGlobalInvestmentCentre);
	}

	public void clickLogOnToSharedealing()throws PageException{
		this.click(HsbcField.LogOnToSharedealing);
	}

	public void clickInvestmentsContacts()throws PageException{
		this.click(HsbcField.InvestmentsContacts);
	}

	public void clickExistingSelectedInvestmentsCustomers()throws PageException{
		this.click(HsbcField.ExistingSelectedInvestmentsCustomers);
	}

	public void clickGettingStartedWithInvesting()throws PageException{
		this.click(HsbcField.GettingStartedWithInvesting);
	}

	public void clickHomeInsurance()throws PageException{
		this.click(HsbcField.HomeInsurance);
	}

	public void clickTravelInsurance()throws PageException{
		this.click(HsbcField.TravelInsurance);
	}

	public void clickStudentInsurance()throws PageException{
		this.click(HsbcField.StudentInsurance);
	}

	public void clickLifeCover()throws PageException{
		this.click(HsbcField.LifeCover);
	}

	public void clickCriticalIllnessCover()throws PageException{
		this.click(HsbcField.CriticalIllnessCover);
	}

	public void clickIncomeCover()throws PageException{
		this.click(HsbcField.IncomeCover);
	}

	public void clickTelephoneProtectionAdvice()throws PageException{
		this.click(HsbcField.TelephoneProtectionAdvice);
	}

	public void clickHomeInsuranceClaims()throws PageException{
		this.click(HsbcField.HomeInsuranceClaims);
	}

	public void clickTravelInsuranceClaims()throws PageException{
		this.click(HsbcField.TravelInsuranceClaims);
	}

	public void clickCarInsuranceClaims()throws PageException{
		this.click(HsbcField.CarInsuranceClaims);
	}

	public void clickBereavementSupport()throws PageException{
		this.click(HsbcField.BereavementSupport);
	}

	public void clickSeparationSupport()throws PageException{
		this.click(HsbcField.SeparationSupport);
	}

	public void clickSettlingInTheUK()throws PageException{
		this.click(HsbcField.SettlingInTheUK);
	}

	public void clickGettingMarried()throws PageException{
		this.click(HsbcField.GettingMarried);
	}

	public void clickPlanningYourRetirement()throws PageException{
		this.click(HsbcField.PlanningYourRetirement);
	}

	public void clickGrowingYourWealth()throws PageException{
		this.click(HsbcField.GrowingYourWealth);
	}

	public void clickMovingAbroad()throws PageException{
		this.click(HsbcField.MovingAbroad);
	}

	public void clickFinancialHealthCheck()throws PageException{
		this.click(HsbcField.FinancialHealthCheck);
	}

	public void clickLearnMore()throws PageException{
		this.click(HsbcField.LearnMore);
	}

	public void clickWaysWeCanHelp()throws PageException{
		this.click(HsbcField.WaysWeCanHelp);
	}

	public void clickFrequentlyAskedQuestions()throws PageException{
		this.click(HsbcField.FrequentlyAskedQuestions);
	}

	public void clickBookYourReviewTodayForAQuickFinancialCheckup()throws PageException{
		this.click(HsbcField.BookYourReviewTodayForAQuickFinancialCheckup);
	}

	public void clickLegal()throws PageException{
		this.click(HsbcField.Legal);
	}

	public void clickPrivacyNotice()throws PageException{
		this.click(HsbcField.PrivacyNotice);
	}

	public void clickCookiePolicy()throws PageException{
		this.click(HsbcField.CookiePolicy);
	}

	public void clickAccessibility()throws PageException{
		this.click(HsbcField.Accessibility);
	}

	public void clickUKRingFencing()throws PageException{
		this.click(HsbcField.UKRingFencing);
	}

	public void clickHpIntroButton1()throws PageException{
		this.click(HsbcField.HpIntroButton1);
	}

	public void clickHpSocialmediafooterlink1()throws PageException{
		this.click(HsbcField.HpSocialmediafooterlink1);
	}

	public void clickHpSocialmediafooterlink2()throws PageException{
		this.click(HsbcField.HpSocialmediafooterlink2);
	}

	public void clickHpSocialmediafooterlink3()throws PageException{
		this.click(HsbcField.HpSocialmediafooterlink3);
	}

	public void clickClose()throws PageException{
		this.click(HsbcField.Close);
	}

	public void clickSkipPageHeaderAndNavigation()throws PageException{
		this.click(HsbcField.SkipPageHeaderAndNavigation);
	}

	public void clickPersonal2()throws PageException{
		this.click(HsbcField.Personal2);
	}

	public void clickBusiness2()throws PageException{
		this.click(HsbcField.Business2);
	}

	public void clickEnglish()throws PageException{
		this.click(HsbcField.English);
	}

	public void clickMoveToBorrowingNavigation()throws PageException{
		this.click(HsbcField.MoveToBorrowingNavigation);
	}

	public void clickCurrentAccounts()throws PageException{
		this.click(HsbcField.CurrentAccounts);
	}

	public void clickHSBCPremierAccount2()throws PageException{
		this.click(HsbcField.HSBCPremierAccount2);
	}

	public void clickHSBCAdvanceAccount2()throws PageException{
		this.click(HsbcField.HSBCAdvanceAccount2);
	}

	public void clickBankAccount2()throws PageException{
		this.click(HsbcField.BankAccount2);
	}

	public void clickStudentAccount()throws PageException{
		this.click(HsbcField.StudentAccount);
	}

	public void clickSwitchingToHSBC2()throws PageException{
		this.click(HsbcField.SwitchingToHSBC2);
	}

	public void clickSavings()throws PageException{
		this.click(HsbcField.Savings);
	}

	public void clickISAs2()throws PageException{
		this.click(HsbcField.ISAs2);
	}

	public void clickOnlineBonusSaver2()throws PageException{
		this.click(HsbcField.OnlineBonusSaver2);
	}

	public void clickFlexibleSaver2()throws PageException{
		this.click(HsbcField.FlexibleSaver2);
	}

	public void clickCustomerSupport()throws PageException{
		this.click(HsbcField.CustomerSupport);
	}

	public void clickCardSupport()throws PageException{
		this.click(HsbcField.CardSupport);
	}

	public void clickMoneyWorries2()throws PageException{
		this.click(HsbcField.MoneyWorries2);
	}

	public void clickWaysToBank2()throws PageException{
		this.click(HsbcField.WaysToBank2);
	}

	public void clickCreditCards()throws PageException{
		this.click(HsbcField.CreditCards);
	}

	public void clickHSBCCreditCard()throws PageException{
		this.click(HsbcField.HSBCCreditCard);
	}

	public void clickHSBCPremierCreditCard()throws PageException{
		this.click(HsbcField.HSBCPremierCreditCard);
	}

	public void clickStudentCreditCard2()throws PageException{
		this.click(HsbcField.StudentCreditCard2);
	}

	public void clickInternationalServices()throws PageException{
		this.click(HsbcField.InternationalServices);
	}

	public void clickHSBCCurrencyAccount2()throws PageException{
		this.click(HsbcField.HSBCCurrencyAccount2);
	}

	public void clickInternationalPayments2()throws PageException{
		this.click(HsbcField.InternationalPayments2);
	}

	public void clickTravelMoney2()throws PageException{
		this.click(HsbcField.TravelMoney2);
	}

	public void clickOverseasAccountOpening()throws PageException{
		this.click(HsbcField.OverseasAccountOpening);
	}

	public void clickMoveToInvestingNavigation()throws PageException{
		this.click(HsbcField.MoveToInvestingNavigation);
	}

	public void clickLoans()throws PageException{
		this.click(HsbcField.Loans);
	}

	public void clickPersonalLoan2()throws PageException{
		this.click(HsbcField.PersonalLoan2);
	}

	public void clickFlexiLoan()throws PageException{
		this.click(HsbcField.FlexiLoan);
	}

	public void clickPremierPersonalLoan2()throws PageException{
		this.click(HsbcField.PremierPersonalLoan2);
	}

	public void clickGraduateLoan2()throws PageException{
		this.click(HsbcField.GraduateLoan2);
	}

	public void clickClassicCreditCard2()throws PageException{
		this.click(HsbcField.ClassicCreditCard2);
	}

	public void clickStudentVisaCreditCard()throws PageException{
		this.click(HsbcField.StudentVisaCreditCard);
	}

	public void clickMortgages()throws PageException{
		this.click(HsbcField.Mortgages);
	}

	public void clickFirstTimeBuyer2()throws PageException{
		this.click(HsbcField.FirstTimeBuyer2);
	}

	public void clickBuyToLet2()throws PageException{
		this.click(HsbcField.BuyToLet2);
	}

	public void clickCompareMortgages()throws PageException{
		this.click(HsbcField.CompareMortgages);
	}

	public void clickHowMuchCanIBorrow()throws PageException{
		this.click(HsbcField.HowMuchCanIBorrow);
	}

	public void clickExistingCustomers()throws PageException{
		this.click(HsbcField.ExistingCustomers);
	}

	public void clickOverpaymentCalculator2()throws PageException{
		this.click(HsbcField.OverpaymentCalculator2);
	}

	public void clickRepaymentCalculator2()throws PageException{
		this.click(HsbcField.RepaymentCalculator2);
	}

	public void clickHelpAmpGuidance()throws PageException{
		this.click(HsbcField.HelpAmpGuidance);
	}

	public void clickOverdraftService()throws PageException{
		this.click(HsbcField.OverdraftService);
	}

	public void clickTakingControlOfYourFinances()throws PageException{
		this.click(HsbcField.TakingControlOfYourFinances);
	}

	public void clickManagingYourMortgagePayments()throws PageException{
		this.click(HsbcField.ManagingYourMortgagePayments);
	}

	public void clickBuyingYourFirstHome()throws PageException{
		this.click(HsbcField.BuyingYourFirstHome);
	}

	public void clickMortgageJargonBuster()throws PageException{
		this.click(HsbcField.MortgageJargonBuster);
	}

	public void clickMoveToInsuranceNavigation()throws PageException{
		this.click(HsbcField.MoveToInsuranceNavigation);
	}

	public void clickInvestments()throws PageException{
		this.click(HsbcField.Investments);
	}

	public void clickInvestmentFunds2()throws PageException{
		this.click(HsbcField.InvestmentFunds2);
	}

	public void clickSelectedInvestmentFundsISA()throws PageException{
		this.click(HsbcField.SelectedInvestmentFundsISA);
	}

	public void clickSharedealing2()throws PageException{
		this.click(HsbcField.Sharedealing2);
	}

	public void clickHSBCPremierFinancialAdvice2()throws PageException{
		this.click(HsbcField.HSBCPremierFinancialAdvice2);
	}

	public void clickChildTrustFund2()throws PageException{
		this.click(HsbcField.ChildTrustFund2);
	}

	public void clickGlobalInvestmentCentre()throws PageException{
		this.click(HsbcField.GlobalInvestmentCentre);
	}

	public void clickFinancialNewsAndAnalysis()throws PageException{
		this.click(HsbcField.FinancialNewsAndAnalysis);
	}

	public void clickWhyInvestWithUs()throws PageException{
		this.click(HsbcField.WhyInvestWithUs);
	}

	public void clickMovePlanningNavigation()throws PageException{
		this.click(HsbcField.MovePlanningNavigation);
	}

	public void clickTravel()throws PageException{
		this.click(HsbcField.Travel);
	}

	public void clickTravelInsurance2()throws PageException{
		this.click(HsbcField.TravelInsurance2);
	}

	public void clickHSBCPremierTravelInsurance()throws PageException{
		this.click(HsbcField.HSBCPremierTravelInsurance);
	}

	public void clickHomeInsurance2()throws PageException{
		this.click(HsbcField.HomeInsurance2);
	}

	public void clickViewAllHSBCInsuranceOptions()throws PageException{
		this.click(HsbcField.ViewAllHSBCInsuranceOptions);
	}

	public void clickHomeInsuranceClaims2()throws PageException{
		this.click(HsbcField.HomeInsuranceClaims2);
	}

	public void clickTravelInsuranceClaims2()throws PageException{
		this.click(HsbcField.TravelInsuranceClaims2);
	}

	public void clickPremierTravelInsuranceClaims()throws PageException{
		this.click(HsbcField.PremierTravelInsuranceClaims);
	}

	public void clickMoveToSiteSearch()throws PageException{
		this.click(HsbcField.MoveToSiteSearch);
	}

	public void clickLifeEvents()throws PageException{
		this.click(HsbcField.LifeEvents);
	}

	public void clickBereavementSupport2()throws PageException{
		this.click(HsbcField.BereavementSupport2);
	}

	public void clickSeparationSupport2()throws PageException{
		this.click(HsbcField.SeparationSupport2);
	}

	public void clickSettlingInTheUK2()throws PageException{
		this.click(HsbcField.SettlingInTheUK2);
	}

	public void clickGettingMarried2()throws PageException{
		this.click(HsbcField.GettingMarried2);
	}

	public void clickPlanningYourRetirement2()throws PageException{
		this.click(HsbcField.PlanningYourRetirement2);
	}

	public void clickGrowingYourWealth2()throws PageException{
		this.click(HsbcField.GrowingYourWealth2);
	}

	public void clickMovingAbroad2()throws PageException{
		this.click(HsbcField.MovingAbroad2);
	}

	public void clickPlanningTools()throws PageException{
		this.click(HsbcField.PlanningTools);
	}

	public void clickFinancialHealthCheck2()throws PageException{
		this.click(HsbcField.FinancialHealthCheck2);
	}

	public void clickProtectingWhatMatters()throws PageException{
		this.click(HsbcField.ProtectingWhatMatters);
	}

	public void clickLearnMore2()throws PageException{
		this.click(HsbcField.LearnMore2);
	}

	public void clickWaysWeCanHelp2()throws PageException{
		this.click(HsbcField.WaysWeCanHelp2);
	}

	public void clickFrequentlyAskedQuestions2()throws PageException{
		this.click(HsbcField.FrequentlyAskedQuestions2);
	}

	public void clickRegisterForOnlineBanking()throws PageException{
		this.click(HsbcField.RegisterForOnlineBanking);
	}

	public void clickRegister()throws PageException{
		this.click(HsbcField.Register);
	}

	public void clickLogOn2()throws PageException{
		this.click(HsbcField.LogOn2);
	}

	public void clickWwwCiiomHsbcCom()throws PageException{
		this.click(HsbcField.WwwCiiomHsbcCom);
	}

	public void clickLogOnToBusinessInternetBanking()throws PageException{
		this.click(HsbcField.LogOnToBusinessInternetBanking);
	}

	public void clickApply()throws PageException{
		this.click(HsbcField.Apply);
	}

	public void clickActivate()throws PageException{
		this.click(HsbcField.Activate);
	}

	public void clickFindOutMoreAboutOnlineBanking()throws PageException{
		this.click(HsbcField.FindOutMoreAboutOnlineBanking);
	}

	public void clickLostDamagedAndStolenSecureKeys()throws PageException{
		this.click(HsbcField.LostDamagedAndStolenSecureKeys);
	}

	public void clickSecurityDownloads()throws PageException{
		this.click(HsbcField.SecurityDownloads);
	}

	public void clickHelpAmpSupport2()throws PageException{
		this.click(HsbcField.HelpAmpSupport2);
	}

	public void clickFindABranch2()throws PageException{
		this.click(HsbcField.FindABranch2);
	}

	public void clickWebsiteFeedback()throws PageException{
		this.click(HsbcField.WebsiteFeedback);
	}

	public void clickSupport()throws PageException{
		this.click(HsbcField.Support);
	}

	public void clickSecurityCentre()throws PageException{
		this.click(HsbcField.SecurityCentre);
	}

	public void clickCoBrowse()throws PageException{
		this.click(HsbcField.CoBrowse);
	}

	public void clickAboutHSBC()throws PageException{
		this.click(HsbcField.AboutHSBC);
	}

	public void clickSiteMap()throws PageException{
		this.click(HsbcField.SiteMap);
	}

	public void clickLegal2()throws PageException{
		this.click(HsbcField.Legal2);
	}

	public void clickPrivacyNotice2()throws PageException{
		this.click(HsbcField.PrivacyNotice2);
	}

	public void clickCookiePolicy2()throws PageException{
		this.click(HsbcField.CookiePolicy2);
	}

	public void clickAccessibility2()throws PageException{
		this.click(HsbcField.Accessibility2);
	}

	public void clickHSBCGroup()throws PageException{
		this.click(HsbcField.HSBCGroup);
	}

	public void clickEurope()throws PageException{
		this.click(HsbcField.Europe);
	}

	public void clickAsiaPacific()throws PageException{
		this.click(HsbcField.AsiaPacific);
	}

	public void clickMiddleEastAmpAfrica()throws PageException{
		this.click(HsbcField.MiddleEastAmpAfrica);
	}

	public void clickAmericas()throws PageException{
		this.click(HsbcField.Americas);
	}

	public void clickArmenia()throws PageException{
		this.click(HsbcField.Armenia);
	}

	public void clickChannelIslandsAndIsleOfMan()throws PageException{
		this.click(HsbcField.ChannelIslandsAndIsleOfMan);
	}

	public void clickCzechRepublic()throws PageException{
		this.click(HsbcField.CzechRepublic);
	}

	public void clickEskRepublika()throws PageException{
		this.click(HsbcField.EskRepublika);
	}

	public void clickGermany()throws PageException{
		this.click(HsbcField.Germany);
	}

	public void clickGreece()throws PageException{
		this.click(HsbcField.Greece);
	}

	public void clickHSBCExpat()throws PageException{
		this.click(HsbcField.HSBCExpat);
	}

	public void clickHungary()throws PageException{
		this.click(HsbcField.Hungary);
	}

	public void clickIreland()throws PageException{
		this.click(HsbcField.Ireland);
	}

	public void clickKazakhstan()throws PageException{
		this.click(HsbcField.Kazakhstan);
	}

	public void clickMalta()throws PageException{
		this.click(HsbcField.Malta);
	}

	public void clickPoland()throws PageException{
		this.click(HsbcField.Poland);
	}

	public void clickPolska()throws PageException{
		this.click(HsbcField.Polska);
	}

	public void clickRussia()throws PageException{
		this.click(HsbcField.Russia);
	}

	public void clickSlovakia()throws PageException{
		this.click(HsbcField.Slovakia);
	}

	public void clickSlovensko()throws PageException{
		this.click(HsbcField.Slovensko);
	}

	public void clickSpain()throws PageException{
		this.click(HsbcField.Spain);
	}

	public void clickEspaA()throws PageException{
		this.click(HsbcField.EspaA);
	}

	public void clickSwitzerland()throws PageException{
		this.click(HsbcField.Switzerland);
	}

	public void clickTurkey()throws PageException{
		this.click(HsbcField.Turkey);
	}

	public void clickTRkiye()throws PageException{
		this.click(HsbcField.TRkiye);
	}

	public void clickUnitedKingdom()throws PageException{
		this.click(HsbcField.UnitedKingdom);
	}

	public void clickAustralia()throws PageException{
		this.click(HsbcField.Australia);
	}

	public void clickBangladesh()throws PageException{
		this.click(HsbcField.Bangladesh);
	}

	public void clickBruneiDarussalam()throws PageException{
		this.click(HsbcField.BruneiDarussalam);
	}

	public void clickChina()throws PageException{
		this.click(HsbcField.China);
	}

	public void clickHongKong()throws PageException{
		this.click(HsbcField.HongKong);
	}

	public void clickIndia()throws PageException{
		this.click(HsbcField.India);
	}

	public void clickJapan()throws PageException{
		this.click(HsbcField.Japan);
	}

	public void clickKorea()throws PageException{
		this.click(HsbcField.Korea);
	}

	public void clickMacau()throws PageException{
		this.click(HsbcField.Macau);
	}

	public void clickMalaysia()throws PageException{
		this.click(HsbcField.Malaysia);
	}

	public void clickMaldives()throws PageException{
		this.click(HsbcField.Maldives);
	}

	public void clickNewZealand()throws PageException{
		this.click(HsbcField.NewZealand);
	}

	public void clickPakistan()throws PageException{
		this.click(HsbcField.Pakistan);
	}

	public void clickPhilippines()throws PageException{
		this.click(HsbcField.Philippines);
	}

	public void clickSingapore()throws PageException{
		this.click(HsbcField.Singapore);
	}

	public void clickSriLanka()throws PageException{
		this.click(HsbcField.SriLanka);
	}

	public void clickTaiwan()throws PageException{
		this.click(HsbcField.Taiwan);
	}

	public void clickThailand()throws PageException{
		this.click(HsbcField.Thailand);
	}

	public void clickVietnam()throws PageException{
		this.click(HsbcField.Vietnam);
	}

	public void clickViTNam()throws PageException{
		this.click(HsbcField.ViTNam);
	}

	public void clickAlgeria()throws PageException{
		this.click(HsbcField.Algeria);
	}

	public void clickEgypt()throws PageException{
		this.click(HsbcField.Egypt);
	}

	public void clickJordan()throws PageException{
		this.click(HsbcField.Jordan);
	}

	public void clickKuwait()throws PageException{
		this.click(HsbcField.Kuwait);
	}

	public void clickLebanon()throws PageException{
		this.click(HsbcField.Lebanon);
	}

	public void clickMauritius()throws PageException{
		this.click(HsbcField.Mauritius);
	}

	public void clickOman()throws PageException{
		this.click(HsbcField.Oman);
	}

	public void clickSaudiArabia()throws PageException{
		this.click(HsbcField.SaudiArabia);
	}

	public void clickSouthAfrica()throws PageException{
		this.click(HsbcField.SouthAfrica);
	}

	public void clickArgentina()throws PageException{
		this.click(HsbcField.Argentina);
	}

	public void clickBermuda()throws PageException{
		this.click(HsbcField.Bermuda);
	}

	public void clickCaymanIslands()throws PageException{
		this.click(HsbcField.CaymanIslands);
	}

	public void clickCostaRica()throws PageException{
		this.click(HsbcField.CostaRica);
	}

	public void clickElSalvador()throws PageException{
		this.click(HsbcField.ElSalvador);
	}

	public void clickHonduras()throws PageException{
		this.click(HsbcField.Honduras);
	}

	public void clickPer()throws PageException{
		this.click(HsbcField.Per);
	}

	public void clickUnitedStates()throws PageException{
		this.click(HsbcField.UnitedStates);
	}

	public void clickUruguay()throws PageException{
		this.click(HsbcField.Uruguay);
	}

	public void clickCancel()throws PageException{
		this.click(HsbcField.Cancel);
	}

	public void clickContinue()throws PageException{
		this.click(HsbcField.Continue);
	}

	public void clickSkip()throws PageException{
		this.click(HsbcField.Skip);
	}

	public void clickBrowserlink()throws PageException{
		this.click(HsbcField.Browserlink);
	}

	public void clickNextCob()throws PageException{
		this.click(HsbcField.NextCob);
	}

	public void clickLaunchCob()throws PageException{
		this.click(HsbcField.LaunchCob);
	}

	public void clickRestartCob()throws PageException{
		this.click(HsbcField.RestartCob);
	}

	public void clickSkipPageHeaderAndNavigation2()throws PageException{
		this.click(HsbcField.SkipPageHeaderAndNavigation2);
	}

	public void clickPersonal3()throws PageException{
		this.click(HsbcField.Personal3);
	}

	public void clickBusiness3()throws PageException{
		this.click(HsbcField.Business3);
	}

	public void clickRegistration()throws PageException{
		this.click(HsbcField.Registration);
	}

	public void clickRegistered()throws PageException{
		this.click(HsbcField.Registered);
	}

	public void clickFindOutMore2()throws PageException{
		this.click(HsbcField.FindOutMore2);
	}

	public void clickRegister2()throws PageException{
		this.click(HsbcField.Register2);
	}

	public void clickSkipToBorrowingNavigation()throws PageException{
		this.click(HsbcField.SkipToBorrowingNavigation);
	}

	public void clickCurrentAccounts2()throws PageException{
		this.click(HsbcField.CurrentAccounts2);
	}

	public void clickHSBCPremierAccount3()throws PageException{
		this.click(HsbcField.HSBCPremierAccount3);
	}

	public void clickHSBCAdvanceAccount3()throws PageException{
		this.click(HsbcField.HSBCAdvanceAccount3);
	}

	public void clickHSBCStudentAccount2()throws PageException{
		this.click(HsbcField.HSBCStudentAccount2);
	}

	public void clickBankAccount3()throws PageException{
		this.click(HsbcField.BankAccount3);
	}

	public void clickSavings2()throws PageException{
		this.click(HsbcField.Savings2);
	}

	public void clickISAs3()throws PageException{
		this.click(HsbcField.ISAs3);
	}

	public void clickOnlineBonusSaver3()throws PageException{
		this.click(HsbcField.OnlineBonusSaver3);
	}

	public void clickFlexibleSaver3()throws PageException{
		this.click(HsbcField.FlexibleSaver3);
	}

	public void clickCreditCards2()throws PageException{
		this.click(HsbcField.CreditCards2);
	}

	public void clickHSBCCreditCards()throws PageException{
		this.click(HsbcField.HSBCCreditCards);
	}

	public void clickPremierCreditCard2()throws PageException{
		this.click(HsbcField.PremierCreditCard2);
	}

	public void clickStudentCreditCard3()throws PageException{
		this.click(HsbcField.StudentCreditCard3);
	}

	public void clickInternationalServices2()throws PageException{
		this.click(HsbcField.InternationalServices2);
	}

	public void clickHSBCCurrencyAccount3()throws PageException{
		this.click(HsbcField.HSBCCurrencyAccount3);
	}

	public void clickInternationalPayments3()throws PageException{
		this.click(HsbcField.InternationalPayments3);
	}

	public void clickTravelMoney3()throws PageException{
		this.click(HsbcField.TravelMoney3);
	}

	public void clickServices()throws PageException{
		this.click(HsbcField.Services);
	}

	public void clickWaysToBank3()throws PageException{
		this.click(HsbcField.WaysToBank3);
	}

	public void clickVoiceID2()throws PageException{
		this.click(HsbcField.VoiceID2);
	}

	public void clickCustomerSupport2()throws PageException{
		this.click(HsbcField.CustomerSupport2);
	}

	public void clickFindABranch3()throws PageException{
		this.click(HsbcField.FindABranch3);
	}

	public void clickMoreThanJustACurrentAccount()throws PageException{
		this.click(HsbcField.MoreThanJustACurrentAccount);
	}

	public void clickPremiumBankingWithoutThePremium()throws PageException{
		this.click(HsbcField.PremiumBankingWithoutThePremium);
	}

	public void clickSkipToInvestingNavigation()throws PageException{
		this.click(HsbcField.SkipToInvestingNavigation);
	}

	public void clickLoans2()throws PageException{
		this.click(HsbcField.Loans2);
	}

	public void clickPersonalLoan3()throws PageException{
		this.click(HsbcField.PersonalLoan3);
	}

	public void clickFlexiloan2()throws PageException{
		this.click(HsbcField.Flexiloan2);
	}

	public void clickPremierPersonalLoan3()throws PageException{
		this.click(HsbcField.PremierPersonalLoan3);
	}

	public void clickGraduateLoan3()throws PageException{
		this.click(HsbcField.GraduateLoan3);
	}

	public void clickMortgages2()throws PageException{
		this.click(HsbcField.Mortgages2);
	}

	public void clickFirstTimeBuyer3()throws PageException{
		this.click(HsbcField.FirstTimeBuyer3);
	}

	public void click95Mortgages()throws PageException{
		this.click(HsbcField.VALUE_OF_95Mortgages);
	}

	public void clickRemortgage2()throws PageException{
		this.click(HsbcField.Remortgage2);
	}

	public void clickBuyToLet3()throws PageException{
		this.click(HsbcField.BuyToLet3);
	}

	public void clickExistingCustomers2()throws PageException{
		this.click(HsbcField.ExistingCustomers2);
	}

	public void clickMortgageRates2()throws PageException{
		this.click(HsbcField.MortgageRates2);
	}

	public void clickArmedForcesPersonnel2()throws PageException{
		this.click(HsbcField.ArmedForcesPersonnel2);
	}

	public void clickPremierCreditCards()throws PageException{
		this.click(HsbcField.PremierCreditCards);
	}

	public void clickOverdrafts()throws PageException{
		this.click(HsbcField.Overdrafts);
	}

	public void clickHelpAmpSupport3()throws PageException{
		this.click(HsbcField.HelpAmpSupport3);
	}

	public void clickToolsAmpGuides()throws PageException{
		this.click(HsbcField.ToolsAmpGuides);
	}

	public void clickMortgageCalculator2()throws PageException{
		this.click(HsbcField.MortgageCalculator2);
	}

	public void clickOverpaymentCalculator3()throws PageException{
		this.click(HsbcField.OverpaymentCalculator3);
	}

	public void clickRepaymentCalculator3()throws PageException{
		this.click(HsbcField.RepaymentCalculator3);
	}

	public void clickBaseRateInformation2()throws PageException{
		this.click(HsbcField.BaseRateInformation2);
	}

	public void clickAccessToPreferentialRatesAndTerms()throws PageException{
		this.click(HsbcField.AccessToPreferentialRatesAndTerms);
	}

	public void clickAskAboutOurBuyToLetMortgages()throws PageException{
		this.click(HsbcField.AskAboutOurBuyToLetMortgages);
	}

	public void clickSkipToInsuranceNavigation()throws PageException{
		this.click(HsbcField.SkipToInsuranceNavigation);
	}

	public void clickInvestments2()throws PageException{
		this.click(HsbcField.Investments2);
	}

	public void clickInvestmentFunds3()throws PageException{
		this.click(HsbcField.InvestmentFunds3);
	}

	public void clickWorldSelectionISA2()throws PageException{
		this.click(HsbcField.WorldSelectionISA2);
	}

	public void clickSharedealing3()throws PageException{
		this.click(HsbcField.Sharedealing3);
	}

	public void clickHSBCPremierFinancialAdvice3()throws PageException{
		this.click(HsbcField.HSBCPremierFinancialAdvice3);
	}

	public void clickHSBCStandAloneInvestmentAdvice2()throws PageException{
		this.click(HsbcField.HSBCStandAloneInvestmentAdvice2);
	}

	public void clickHSBCOnshoreInvestmentBond2()throws PageException{
		this.click(HsbcField.HSBCOnshoreInvestmentBond2);
	}

	public void clickChildTrustFund3()throws PageException{
		this.click(HsbcField.ChildTrustFund3);
	}

	public void clickFinancialNewsAmpAnalysis()throws PageException{
		this.click(HsbcField.FinancialNewsAmpAnalysis);
	}

	public void clickWhyInvestWithUs2()throws PageException{
		this.click(HsbcField.WhyInvestWithUs2);
	}

	public void clickGlobalInvestmentCentre2()throws PageException{
		this.click(HsbcField.GlobalInvestmentCentre2);
	}

	public void clickInvestmentsContacts2()throws PageException{
		this.click(HsbcField.InvestmentsContacts2);
	}

	public void clickExistingSelectedInvestmentsCustomers2()throws PageException{
		this.click(HsbcField.ExistingSelectedInvestmentsCustomers2);
	}

	public void clickGettingStartedWithInvesting2()throws PageException{
		this.click(HsbcField.GettingStartedWithInvesting2);
	}

	public void clickAccessToWealthManagementExpertise()throws PageException{
		this.click(HsbcField.AccessToWealthManagementExpertise);
	}

	public void clickSkipToPlanningNavigation()throws PageException{
		this.click(HsbcField.SkipToPlanningNavigation);
	}

	public void clickInsurance()throws PageException{
		this.click(HsbcField.Insurance);
	}

	public void clickHomeInsurance3()throws PageException{
		this.click(HsbcField.HomeInsurance3);
	}

	public void clickTravelInsurance3()throws PageException{
		this.click(HsbcField.TravelInsurance3);
	}

	public void clickStudentInsurance2()throws PageException{
		this.click(HsbcField.StudentInsurance2);
	}

	public void clickLifeInsurance()throws PageException{
		this.click(HsbcField.LifeInsurance);
	}

	public void clickLifeCover2()throws PageException{
		this.click(HsbcField.LifeCover2);
	}

	public void clickCriticalIllnessCover2()throws PageException{
		this.click(HsbcField.CriticalIllnessCover2);
	}

	public void clickIncomeCover2()throws PageException{
		this.click(HsbcField.IncomeCover2);
	}

	public void clickTelephoneProtectionAdvice2()throws PageException{
		this.click(HsbcField.TelephoneProtectionAdvice2);
	}

	public void clickInsuranceClaims()throws PageException{
		this.click(HsbcField.InsuranceClaims);
	}

	public void clickHomeInsuranceClaims3()throws PageException{
		this.click(HsbcField.HomeInsuranceClaims3);
	}

	public void clickTravelInsuranceClaims3()throws PageException{
		this.click(HsbcField.TravelInsuranceClaims3);
	}

	public void clickCarInsuranceClaims2()throws PageException{
		this.click(HsbcField.CarInsuranceClaims2);
	}

	public void clickPremierCustomers()throws PageException{
		this.click(HsbcField.PremierCustomers);
	}

	public void clickHelpingYouTakeCareOfTheThingsThatCount()throws PageException{
		this.click(HsbcField.HelpingYouTakeCareOfTheThingsThatCount);
	}

	public void clickBenefitsForYouYourPartnerAndYourChildren()throws PageException{
		this.click(HsbcField.BenefitsForYouYourPartnerAndYourChildren);
	}

	public void clickSkipToMainContent()throws PageException{
		this.click(HsbcField.SkipToMainContent);
	}

	public void clickLifeEvents2()throws PageException{
		this.click(HsbcField.LifeEvents2);
	}

	public void clickBereavementSupport3()throws PageException{
		this.click(HsbcField.BereavementSupport3);
	}

	public void clickSeparationSupport3()throws PageException{
		this.click(HsbcField.SeparationSupport3);
	}

	public void clickSettlingInTheUK3()throws PageException{
		this.click(HsbcField.SettlingInTheUK3);
	}

	public void clickGettingMarried3()throws PageException{
		this.click(HsbcField.GettingMarried3);
	}

	public void clickPlanningYourRetirement3()throws PageException{
		this.click(HsbcField.PlanningYourRetirement3);
	}

	public void clickGrowingYourWealth3()throws PageException{
		this.click(HsbcField.GrowingYourWealth3);
	}

	public void clickMovingAbroad3()throws PageException{
		this.click(HsbcField.MovingAbroad3);
	}

	public void clickPlanningTools2()throws PageException{
		this.click(HsbcField.PlanningTools2);
	}

	public void clickFinancialHealthCheck3()throws PageException{
		this.click(HsbcField.FinancialHealthCheck3);
	}

	public void clickProtectingWhatMatters2()throws PageException{
		this.click(HsbcField.ProtectingWhatMatters2);
	}

	public void clickLearnMore3()throws PageException{
		this.click(HsbcField.LearnMore3);
	}

	public void clickWaysWeCanHelp3()throws PageException{
		this.click(HsbcField.WaysWeCanHelp3);
	}

	public void clickFrequentlyAskedQuestions3()throws PageException{
		this.click(HsbcField.FrequentlyAskedQuestions3);
	}

	public void clickIndividualReview()throws PageException{
		this.click(HsbcField.IndividualReview);
	}

	public void clickBookYourReviewTodayForAQuickFinancialCheckup2()throws PageException{
		this.click(HsbcField.BookYourReviewTodayForAQuickFinancialCheckup2);
	}

	public void clickBookAnIndividualReviewOfYourFinances()throws PageException{
		this.click(HsbcField.BookAnIndividualReviewOfYourFinances);
	}

	public void clickBookAnAppointmentWithOneOfOurExperts()throws PageException{
		this.click(HsbcField.BookAnAppointmentWithOneOfOurExperts);
	}

	public void clickCookieNbspPolicy()throws PageException{
		this.click(HsbcField.CookieNbspPolicy);
	}

	public void clickHome()throws PageException{
		this.click(HsbcField.Home);
	}

	public void clickWebsiteFeedback2()throws PageException{
		this.click(HsbcField.WebsiteFeedback2);
	}

	public void clickShare()throws PageException{
		this.click(HsbcField.Share);
	}

	public void clickPrint()throws PageException{
		this.click(HsbcField.Print);
	}

	public void clickCookiePolicy3()throws PageException{
		this.click(HsbcField.CookiePolicy3);
	}

	public void clickBackToTop()throws PageException{
		this.click(HsbcField.BackToTop);
	}

	public void clickSavingAccounts()throws PageException{
		this.click(HsbcField.SavingAccounts);
	}

	public void clickInvesting()throws PageException{
		this.click(HsbcField.Investing);
	}

	public void clickEverydayBanking()throws PageException{
		this.click(HsbcField.EverydayBanking);
	}

	public void clickSwitchingToHSBC3()throws PageException{
		this.click(HsbcField.SwitchingToHSBC3);
	}

	public void clickSecurityCentre2()throws PageException{
		this.click(HsbcField.SecurityCentre2);
	}

	public void clickCardSupport2()throws PageException{
		this.click(HsbcField.CardSupport2);
	}

	public void clickOnlineBanking()throws PageException{
		this.click(HsbcField.OnlineBanking);
	}

	public void clickHSBCExpat2()throws PageException{
		this.click(HsbcField.HSBCExpat2);
	}

	public void clickHSBCPrivateBank()throws PageException{
		this.click(HsbcField.HSBCPrivateBank);
	}

	public void clickBorrowing()throws PageException{
		this.click(HsbcField.Borrowing);
	}

	public void clickMortgageCalculators()throws PageException{
		this.click(HsbcField.MortgageCalculators);
	}

	public void clickCarInsurance()throws PageException{
		this.click(HsbcField.CarInsurance);
	}

	public void clickPremierCarInsurance()throws PageException{
		this.click(HsbcField.PremierCarInsurance);
	}

	public void clickLifeCriticalIllnessAmpIncomeCover()throws PageException{
		this.click(HsbcField.LifeCriticalIllnessAmpIncomeCover);
	}

	public void clickHealthAmpFamily()throws PageException{
		this.click(HsbcField.HealthAmpFamily);
	}

	public void clickHomeAmpLifestyle()throws PageException{
		this.click(HsbcField.HomeAmpLifestyle);
	}

	public void clickWorkAmpRetirement()throws PageException{
		this.click(HsbcField.WorkAmpRetirement);
	}

	public void clickAboutHSBC2()throws PageException{
		this.click(HsbcField.AboutHSBC2);
	}

	public void clickSiteMap2()throws PageException{
		this.click(HsbcField.SiteMap2);
	}

	public void clickNewsAndMedia()throws PageException{
		this.click(HsbcField.NewsAndMedia);
	}

	public void clickLegal3()throws PageException{
		this.click(HsbcField.Legal3);
	}

	public void clickPrivacyNotice3()throws PageException{
		this.click(HsbcField.PrivacyNotice3);
	}

	public void clickAccessibility3()throws PageException{
		this.click(HsbcField.Accessibility3);
	}

	public void clickCareers()throws PageException{
		this.click(HsbcField.Careers);
	}

	public void clickHSBCGroup2()throws PageException{
		this.click(HsbcField.HSBCGroup2);
	}

	public void clickUKRingFencing2()throws PageException{
		this.click(HsbcField.UKRingFencing2);
	}

	public void click70G3UNU10SD0MHTI7H4D1000000()throws PageException{
		this.click(HsbcField.VALUE_OF_70G3UNU10SD0MHTI7H4D1000000);
	}

	public void clickSkip2()throws PageException{
		this.click(HsbcField.Skip2);
	}

	public void click70G3UNU10SD0MHTI7J4D1000000()throws PageException{
		this.click(HsbcField.VALUE_OF_70G3UNU10SD0MHTI7J4D1000000);
	}

	public void click7H2I8H042H865C0AM2V2O1G3GL4()throws PageException{
		this.click(HsbcField.VALUE_OF_7H2I8H042H865C0AM2V2O1G3GL4);
	}

	public void clickDoormat0()throws PageException{
		this.click(HsbcField.Doormat0);
	}

	public void clickDoormat1()throws PageException{
		this.click(HsbcField.Doormat1);
	}

	public void clickDoormat2()throws PageException{
		this.click(HsbcField.Doormat2);
	}

	public void clickDoormat3()throws PageException{
		this.click(HsbcField.Doormat3);
	}

	public void clickDoormat4()throws PageException{
		this.click(HsbcField.Doormat4);
	}

	public void clickTwitterShare()throws PageException{
		this.click(HsbcField.TwitterShare);
	}

	public void clickFacebookShare()throws PageException{
		this.click(HsbcField.FacebookShare);
	}

	public void clickDiggShare()throws PageException{
		this.click(HsbcField.DiggShare);
	}

	public void clickRedditShare()throws PageException{
		this.click(HsbcField.RedditShare);
	}

	public void clickContinueBtn2()throws PageException{
		this.click(HsbcField.ContinueBtn2);
	}

	public void clickDownloadLink()throws PageException{
		this.click(HsbcField.DownloadLink);
	}

	public void click7084AOUNTGE0MH7LP30D0000000()throws PageException{
		this.click(HsbcField.VALUE_OF_7084AOUNTGE0MH7LP30D0000000);
	}

	public void click70G3UNU10SD0MHTI7K4D1000000()throws PageException{
		this.click(HsbcField.VALUE_OF_70G3UNU10SD0MHTI7K4D1000000);
	}

}
