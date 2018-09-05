package com.dmcc.sample.pages.lloydsbank;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.sample.pages.lloydsbank.LloydsbankField;
import com.dmcc.pagegen.page.mccarterp.McCarterPage;

public class LloydsbankPage extends McCarterPage{

private final String url="https://www.lloydsbank.com";
private final String rRoot="../pgenexamples/src/test/resources";

	public LloydsbankPage navigate()throws PageException {
		this.setResourcesRoot(rRoot);
		this.navigate(url);
		return this;
	}

	public void setQ(final String value) throws PageException{
		this.setValue(LloydsbankField.Q, value);
	}

	public void clickQ()throws PageException{
		this.click(LloydsbankField.Q);
	}

	public void clickSkipToContentAccessKeyS()throws PageException{
		this.click(LloydsbankField.SkipToContentAccessKeyS);
	}

	public void clickSkipToFooterAccessKeyT()throws PageException{
		this.click(LloydsbankField.SkipToFooterAccessKeyT);
	}

	public void clickBusiness()throws PageException{
		this.click(LloydsbankField.Business);
	}

	public void clickPrivateBanking()throws PageException{
		this.click(LloydsbankField.PrivateBanking);
	}

	public void clickInternationalBanking()throws PageException{
		this.click(LloydsbankField.InternationalBanking);
	}

	public void clickRegister()throws PageException{
		this.click(LloydsbankField.Register);
	}

	public void clickKeepMeSecure()throws PageException{
		this.click(LloydsbankField.KeepMeSecure);
	}

	public void clickProductsAndServices()throws PageException{
		this.click(LloydsbankField.ProductsAndServices);
	}

	public void clickCurrentAccounts()throws PageException{
		this.click(LloydsbankField.CurrentAccounts);
	}

	public void clickFeaturedCurrentAccounts()throws PageException{
		this.click(LloydsbankField.FeaturedCurrentAccounts);
	}

	public void clickUpgradeYourAccount()throws PageException{
		this.click(LloydsbankField.UpgradeYourAccount);
	}

	public void clickYouthAndStudentAccounts()throws PageException{
		this.click(LloydsbankField.YouthAndStudentAccounts);
	}

	public void clickCompareAllOfOurAccounts()throws PageException{
		this.click(LloydsbankField.CompareAllOfOurAccounts);
	}

	public void clickClubLloyds()throws PageException{
		this.click(LloydsbankField.ClubLloyds);
	}

	public void clickStudentAccount()throws PageException{
		this.click(LloydsbankField.StudentAccount);
	}

	public void clickInternational()throws PageException{
		this.click(LloydsbankField.International);
	}

	public void clickExistingCustomers()throws PageException{
		this.click(LloydsbankField.ExistingCustomers);
	}

	public void clickJointAccounts()throws PageException{
		this.click(LloydsbankField.JointAccounts);
	}

	public void clickPersonalOverdrafts()throws PageException{
		this.click(LloydsbankField.PersonalOverdrafts);
	}

	public void clickSafeDepositBoxes()throws PageException{
		this.click(LloydsbankField.SafeDepositBoxes);
	}

	public void clickSwitchingToLloydsBank()throws PageException{
		this.click(LloydsbankField.SwitchingToLloydsBank);
	}

	public void clickSaveTheChange()throws PageException{
		this.click(LloydsbankField.SaveTheChange);
	}

	public void clickRatesAndCharges()throws PageException{
		this.click(LloydsbankField.RatesAndCharges);
	}

	public void clickHelpAndGuidance()throws PageException{
		this.click(LloydsbankField.HelpAndGuidance);
	}

	public void clickCreditCards()throws PageException{
		this.click(LloydsbankField.CreditCards);
	}

	public void clickAllCreditCards()throws PageException{
		this.click(LloydsbankField.AllCreditCards);
	}

	public void clickLowFeeBalanceTransferCard()throws PageException{
		this.click(LloydsbankField.LowFeeBalanceTransferCard);
	}

	public void clickLongest0BalanceTransferCard()throws PageException{
		this.click(LloydsbankField.Longest0BalanceTransferCard);
	}

	public void clickNoFee0BalanceTransferCard()throws PageException{
		this.click(LloydsbankField.NoFee0BalanceTransferCard);
	}

	public void click0PurchaseAndBalanceTransferCard()throws PageException{
		this.click(LloydsbankField.VALUE_OF_0PurchaseAndBalanceTransferCard);
	}

	public void clickLowRateCard()throws PageException{
		this.click(LloydsbankField.LowRateCard);
	}

	public void clickExistingCreditCardCustomers()throws PageException{
		this.click(LloydsbankField.ExistingCreditCardCustomers);
	}

	public void clickManagingYourCreditCard()throws PageException{
		this.click(LloydsbankField.ManagingYourCreditCard);
	}

	public void clickActivateYourCreditCard()throws PageException{
		this.click(LloydsbankField.ActivateYourCreditCard);
	}

	public void clickBalanceTransfers()throws PageException{
		this.click(LloydsbankField.BalanceTransfers);
	}

	public void clickMoneyTransfers()throws PageException{
		this.click(LloydsbankField.MoneyTransfers);
	}

	public void clickApplyForASecondCreditCard()throws PageException{
		this.click(LloydsbankField.ApplyForASecondCreditCard);
	}

	public void clickWhatToDoIfYourCardIsLostOrStolen()throws PageException{
		this.click(LloydsbankField.WhatToDoIfYourCardIsLostOrStolen);
	}

	public void clickHelpWithCreditCardDebt()throws PageException{
		this.click(LloydsbankField.HelpWithCreditCardDebt);
	}

	public void clickSavings()throws PageException{
		this.click(LloydsbankField.Savings);
	}

	public void clickAllSavingsAccounts()throws PageException{
		this.click(LloydsbankField.AllSavingsAccounts);
	}

	public void clickOnline()throws PageException{
		this.click(LloydsbankField.Online);
	}

	public void clickInstantAccessSavingsAccounts()throws PageException{
		this.click(LloydsbankField.InstantAccessSavingsAccounts);
	}

	public void clickTaxFreeISAs()throws PageException{
		this.click(LloydsbankField.TaxFreeISAs);
	}

	public void clickFixedTermSavings()throws PageException{
		this.click(LloydsbankField.FixedTermSavings);
	}

	public void clickChildrensSavings()throws PageException{
		this.click(LloydsbankField.ChildrensSavings);
	}

	public void clickExistingCustomerInformation()throws PageException{
		this.click(LloydsbankField.ExistingCustomerInformation);
	}

	public void clickSavingsInterestRates()throws PageException{
		this.click(LloydsbankField.SavingsInterestRates);
	}

	public void clickPersonalFinancialAdviceService()throws PageException{
		this.click(LloydsbankField.PersonalFinancialAdviceService);
	}

	public void clickISAs()throws PageException{
		this.click(LloydsbankField.ISAs);
	}

	public void clickCashISASaver()throws PageException{
		this.click(LloydsbankField.CashISASaver);
	}

	public void click2YearFixedRateCashISA()throws PageException{
		this.click(LloydsbankField.VALUE_OF_2YearFixedRateCashISA);
	}

	public void clickHelpToBuyISA()throws PageException{
		this.click(LloydsbankField.HelpToBuyISA);
	}

	public void clickJuniorCashISA()throws PageException{
		this.click(LloydsbankField.JuniorCashISA);
	}

	public void clickInvestmentISA()throws PageException{
		this.click(LloydsbankField.InvestmentISA);
	}

	public void clickShareDealingISA()throws PageException{
		this.click(LloydsbankField.ShareDealingISA);
	}

	public void clickTopUpYourISA()throws PageException{
		this.click(LloydsbankField.TopUpYourISA);
	}

	public void clickTransferYourISA()throws PageException{
		this.click(LloydsbankField.TransferYourISA);
	}

	public void clickRenewYourEasyAccessCashISA()throws PageException{
		this.click(LloydsbankField.RenewYourEasyAccessCashISA);
	}

	public void clickFixedCashISAMaturity()throws PageException{
		this.click(LloydsbankField.FixedCashISAMaturity);
	}

	public void clickInvestments()throws PageException{
		this.click(LloydsbankField.Investments);
	}

	public void clickOurManagedFunds()throws PageException{
		this.click(LloydsbankField.OurManagedFunds);
	}

	public void clickInvestmentAccount()throws PageException{
		this.click(LloydsbankField.InvestmentAccount);
	}

	public void clickRetirement()throws PageException{
		this.click(LloydsbankField.Retirement);
	}

	public void clickWhyChooseUs()throws PageException{
		this.click(LloydsbankField.WhyChooseUs);
	}

	public void clickManageYourInvestments()throws PageException{
		this.click(LloydsbankField.ManageYourInvestments);
	}

	public void clickNewToInvesting()throws PageException{
		this.click(LloydsbankField.NewToInvesting);
	}

	public void clickCouldYouBenefitFromFinancialAdvice()throws PageException{
		this.click(LloydsbankField.CouldYouBenefitFromFinancialAdvice);
	}

	public void clickHelpGuidanceAmpTools()throws PageException{
		this.click(LloydsbankField.HelpGuidanceAmpTools);
	}

	public void clickShareDealing()throws PageException{
		this.click(LloydsbankField.ShareDealing);
	}

	public void clickCompareAccounts()throws PageException{
		this.click(LloydsbankField.CompareAccounts);
	}

	public void clickShareDealingAccount()throws PageException{
		this.click(LloydsbankField.ShareDealingAccount);
	}

	public void clickTransferToUs()throws PageException{
		this.click(LloydsbankField.TransferToUs);
	}

	public void clickRisks()throws PageException{
		this.click(LloydsbankField.Risks);
	}

	public void clickLogOnToOnlineShareDealing()throws PageException{
		this.click(LloydsbankField.LogOnToOnlineShareDealing);
	}

	public void clickCharges()throws PageException{
		this.click(LloydsbankField.Charges);
	}

	public void clickHelpAmpGuidance()throws PageException{
		this.click(LloydsbankField.HelpAmpGuidance);
	}

	public void clickInternationalTrading()throws PageException{
		this.click(LloydsbankField.InternationalTrading);
	}

	public void clickTradingFunds()throws PageException{
		this.click(LloydsbankField.TradingFunds);
	}

	public void clickMortgages()throws PageException{
		this.click(LloydsbankField.Mortgages);
	}

	public void clickAllMortgages()throws PageException{
		this.click(LloydsbankField.AllMortgages);
	}

	public void clickFirstTimeBuyerMortgages()throws PageException{
		this.click(LloydsbankField.FirstTimeBuyerMortgages);
	}

	public void clickHomeMoverMortgages()throws PageException{
		this.click(LloydsbankField.HomeMoverMortgages);
	}

	public void clickBuyToLetMortgages()throws PageException{
		this.click(LloydsbankField.BuyToLetMortgages);
	}

	public void clickRemortgages()throws PageException{
		this.click(LloydsbankField.Remortgages);
	}

	public void clickCalculatorsAndTools()throws PageException{
		this.click(LloydsbankField.CalculatorsAndTools);
	}

	public void clickBookABranchAppointment()throws PageException{
		this.click(LloydsbankField.BookABranchAppointment);
	}

	public void clickManageYourMortgage()throws PageException{
		this.click(LloydsbankField.ManageYourMortgage);
	}

	public void clickSwitchingToANewDeal()throws PageException{
		this.click(LloydsbankField.SwitchingToANewDeal);
	}

	public void clickBorrowingMore()throws PageException{
		this.click(LloydsbankField.BorrowingMore);
	}

	public void clickMortgageFeesAndCharges()throws PageException{
		this.click(LloydsbankField.MortgageFeesAndCharges);
	}

	public void clickLoans()throws PageException{
		this.click(LloydsbankField.Loans);
	}

	public void clickPersonalLoan()throws PageException{
		this.click(LloydsbankField.PersonalLoan);
	}

	public void clickLoanCalculator()throws PageException{
		this.click(LloydsbankField.LoanCalculator);
	}

	public void clickLoanForBuyingACar()throws PageException{
		this.click(LloydsbankField.LoanForBuyingACar);
	}

	public void clickLoanForHomeImprovement()throws PageException{
		this.click(LloydsbankField.LoanForHomeImprovement);
	}

	public void clickLoanForDebtConsolidation()throws PageException{
		this.click(LloydsbankField.LoanForDebtConsolidation);
	}

	public void clickManageYourLoan()throws PageException{
		this.click(LloydsbankField.ManageYourLoan);
	}

	public void clickBorrowMore()throws PageException{
		this.click(LloydsbankField.BorrowMore);
	}

	public void clickNeedHelpBuyingACar()throws PageException{
		this.click(LloydsbankField.NeedHelpBuyingACar);
	}

	public void clickCarFinance()throws PageException{
		this.click(LloydsbankField.CarFinance);
	}

	public void clickCarFinancePlus()throws PageException{
		this.click(LloydsbankField.CarFinancePlus);
	}

	public void clickYourCarFinanceOptions()throws PageException{
		this.click(LloydsbankField.YourCarFinanceOptions);
	}

	public void clickCompareCarFinanceAndPersonalLoans()throws PageException{
		this.click(LloydsbankField.CompareCarFinanceAndPersonalLoans);
	}

	public void clickLogOnToYourAccount()throws PageException{
		this.click(LloydsbankField.LogOnToYourAccount);
	}

	public void clickGoodConditionGuide()throws PageException{
		this.click(LloydsbankField.GoodConditionGuide);
	}

	public void clickFindingTheRightCar()throws PageException{
		this.click(LloydsbankField.FindingTheRightCar);
	}

	public void clickInsurance()throws PageException{
		this.click(LloydsbankField.Insurance);
	}

	public void clickAllInsuranceProducts()throws PageException{
		this.click(LloydsbankField.AllInsuranceProducts);
	}

	public void clickHomeInsurance()throws PageException{
		this.click(LloydsbankField.HomeInsurance);
	}

	public void clickCarInsurance()throws PageException{
		this.click(LloydsbankField.CarInsurance);
	}

	public void clickVanInsurance()throws PageException{
		this.click(LloydsbankField.VanInsurance);
	}

	public void clickTravelInsurance()throws PageException{
		this.click(LloydsbankField.TravelInsurance);
	}

	public void clickLifeInsurance()throws PageException{
		this.click(LloydsbankField.LifeInsurance);
	}

	public void clickLandlordInsurance()throws PageException{
		this.click(LloydsbankField.LandlordInsurance);
	}

	public void clickBusinessInsurance()throws PageException{
		this.click(LloydsbankField.BusinessInsurance);
	}

	public void clickHomeInsurancePolicyBooklets()throws PageException{
		this.click(LloydsbankField.HomeInsurancePolicyBooklets);
	}

	public void clickMakingAnInsuranceClaim()throws PageException{
		this.click(LloydsbankField.MakingAnInsuranceClaim);
	}

	public void clickUnderstandingInsuranceJargon()throws PageException{
		this.click(LloydsbankField.UnderstandingInsuranceJargon);
	}

	public void clickTravelServices()throws PageException{
		this.click(LloydsbankField.TravelServices);
	}

	public void clickAllTravelServices()throws PageException{
		this.click(LloydsbankField.AllTravelServices);
	}

	public void clickTravelMoneyAbroad()throws PageException{
		this.click(LloydsbankField.TravelMoneyAbroad);
	}

	public void clickTravellersCheques()throws PageException{
		this.click(LloydsbankField.TravellersCheques);
	}

	public void clickMakingInternationalPayments()throws PageException{
		this.click(LloydsbankField.MakingInternationalPayments);
	}

	public void clickUsingYourCardAbroad()throws PageException{
		this.click(LloydsbankField.UsingYourCardAbroad);
	}

	public void clickTravelAdvice()throws PageException{
		this.click(LloydsbankField.TravelAdvice);
	}

	public void clickGettingHelpAbroad()throws PageException{
		this.click(LloydsbankField.GettingHelpAbroad);
	}

	public void clickPressReleases()throws PageException{
		this.click(LloydsbankField.PressReleases);
	}

	public void clickHelpAndSupport()throws PageException{
		this.click(LloydsbankField.HelpAndSupport);
	}

	public void clickHelpAndSupportOverview()throws PageException{
		this.click(LloydsbankField.HelpAndSupportOverview);
	}

	public void clickForYourNextStep()throws PageException{
		this.click(LloydsbankField.ForYourNextStep);
	}

	public void clickApproachingRetirement()throws PageException{
		this.click(LloydsbankField.ApproachingRetirement);
	}

	public void clickStartingAFamily()throws PageException{
		this.click(LloydsbankField.StartingAFamily);
	}

	public void clickYourChildsHigherEducation()throws PageException{
		this.click(LloydsbankField.YourChildsHigherEducation);
	}

	public void clickBuyingAHome()throws PageException{
		this.click(LloydsbankField.BuyingAHome);
	}

	public void clickGettingMarried()throws PageException{
		this.click(LloydsbankField.GettingMarried);
	}

	public void clickStartingABusiness()throws PageException{
		this.click(LloydsbankField.StartingABusiness);
	}

	public void clickSeparationAndDivorce()throws PageException{
		this.click(LloydsbankField.SeparationAndDivorce);
	}

	public void clickRedundancy()throws PageException{
		this.click(LloydsbankField.Redundancy);
	}

	public void clickBereavement()throws PageException{
		this.click(LloydsbankField.Bereavement);
	}

	public void clickGoingTravelling()throws PageException{
		this.click(LloydsbankField.GoingTravelling);
	}

	public void clickCustomerSupport()throws PageException{
		this.click(LloydsbankField.CustomerSupport);
	}

	public void clickHelpWithEmergencies()throws PageException{
		this.click(LloydsbankField.HelpWithEmergencies);
	}

	public void clickLostOrStolen()throws PageException{
		this.click(LloydsbankField.LostOrStolen);
	}

	public void clickUnrecognisedTransaction()throws PageException{
		this.click(LloydsbankField.UnrecognisedTransaction);
	}

	public void clickGetHelpAbroad()throws PageException{
		this.click(LloydsbankField.GetHelpAbroad);
	}

	public void clickHelpWithOurProducts()throws PageException{
		this.click(LloydsbankField.HelpWithOurProducts);
	}

	public void clickStepsToTakeAfterBereavement()throws PageException{
		this.click(LloydsbankField.StepsToTakeAfterBereavement);
	}

	public void clickAppointingSomeoneToManageYourAffairs()throws PageException{
		this.click(LloydsbankField.AppointingSomeoneToManageYourAffairs);
	}

	public void clickSupportingCustomersAffectedByCancer()throws PageException{
		this.click(LloydsbankField.SupportingCustomersAffectedByCancer);
	}

	public void clickProductSupport()throws PageException{
		this.click(LloydsbankField.ProductSupport);
	}

	public void clickManagingYourMoney()throws PageException{
		this.click(LloydsbankField.ManagingYourMoney);
	}

	public void clickBudgeting()throws PageException{
		this.click(LloydsbankField.Budgeting);
	}

	public void clickGuidanceForStudents()throws PageException{
		this.click(LloydsbankField.GuidanceForStudents);
	}

	public void clickPersonalFinancialReview()throws PageException{
		this.click(LloydsbankField.PersonalFinancialReview);
	}

	public void clickChildrenAndMoneySurvey()throws PageException{
		this.click(LloydsbankField.ChildrenAndMoneySurvey);
	}

	public void clickPlanningYourFinances()throws PageException{
		this.click(LloydsbankField.PlanningYourFinances);
	}

	public void clickUnderstandingTheBasics()throws PageException{
		this.click(LloydsbankField.UnderstandingTheBasics);
	}

	public void clickPreparingForRetirement()throws PageException{
		this.click(LloydsbankField.PreparingForRetirement);
	}

	public void clickPlanningYourNextStep()throws PageException{
		this.click(LloydsbankField.PlanningYourNextStep);
	}

	public void clickToolsAndCalculators()throws PageException{
		this.click(LloydsbankField.ToolsAndCalculators);
	}

	public void clickProtectingYourselfFromFraud()throws PageException{
		this.click(LloydsbankField.ProtectingYourselfFromFraud);
	}

	public void clickBankingOnlineSafely()throws PageException{
		this.click(LloydsbankField.BankingOnlineSafely);
	}

	public void clickSafeOnlineShopping()throws PageException{
		this.click(LloydsbankField.SafeOnlineShopping);
	}

	public void clickKeepingYourFamilySafe()throws PageException{
		this.click(LloydsbankField.KeepingYourFamilySafe);
	}

	public void clickOffersThatSoundTooGoodToBeTrue()throws PageException{
		this.click(LloydsbankField.OffersThatSoundTooGoodToBeTrue);
	}

	public void clickCardSafety()throws PageException{
		this.click(LloydsbankField.CardSafety);
	}

	public void clickKeepingYourHomeSafe()throws PageException{
		this.click(LloydsbankField.KeepingYourHomeSafe);
	}

	public void clickAskTheExperts()throws PageException{
		this.click(LloydsbankField.AskTheExperts);
	}

	public void clickGetSkillsAndSupportNearYou()throws PageException{
		this.click(LloydsbankField.GetSkillsAndSupportNearYou);
	}

	public void clickMortgageVideoAppointments()throws PageException{
		this.click(LloydsbankField.MortgageVideoAppointments);
	}

	public void clickMoneyWorries()throws PageException{
		this.click(LloydsbankField.MoneyWorries);
	}

	public void clickAccessingOurWebsite()throws PageException{
		this.click(LloydsbankField.AccessingOurWebsite);
	}

	public void clickBankingWithUs()throws PageException{
		this.click(LloydsbankField.BankingWithUs);
	}

	public void clickBankingWithUsOverview()throws PageException{
		this.click(LloydsbankField.BankingWithUsOverview);
	}

	public void clickSwitchToLloydsBank()throws PageException{
		this.click(LloydsbankField.SwitchToLloydsBank);
	}

	public void clickWaysToBank()throws PageException{
		this.click(LloydsbankField.WaysToBank);
	}

	public void clickJoiningLloydsBank()throws PageException{
		this.click(LloydsbankField.JoiningLloydsBank);
	}

	public void clickWhoWeAre()throws PageException{
		this.click(LloydsbankField.WhoWeAre);
	}

	public void clickWhatIsHappening()throws PageException{
		this.click(LloydsbankField.WhatIsHappening);
	}

	public void clickInYourCommunity()throws PageException{
		this.click(LloydsbankField.InYourCommunity);
	}

	public void clickMentalHealthUK()throws PageException{
		this.click(LloydsbankField.MentalHealthUK);
	}

	public void clickOurCharitableFoundations()throws PageException{
		this.click(LloydsbankField.OurCharitableFoundations);
	}

	public void clickFinancialInclusionAndEducation()throws PageException{
		this.click(LloydsbankField.FinancialInclusionAndEducation);
	}

	public void clickSocialEntrepreneursProgramme()throws PageException{
		this.click(LloydsbankField.SocialEntrepreneursProgramme);
	}

	public void clickDigitalInclusion()throws PageException{
		this.click(LloydsbankField.DigitalInclusion);
	}

	public void clickLloydsScholars()throws PageException{
		this.click(LloydsbankField.LloydsScholars);
	}

	public void clickColleagueVolunteering()throws PageException{
		this.click(LloydsbankField.ColleagueVolunteering);
	}

	public void click250YearAnniversary()throws PageException{
		this.click(LloydsbankField.VALUE_OF_250YearAnniversary);
	}

	public void clickEverydayAssistance()throws PageException{
		this.click(LloydsbankField.EverydayAssistance);
	}

	public void clickMobileBranches()throws PageException{
		this.click(LloydsbankField.MobileBranches);
	}

	public void clickBankingOnline()throws PageException{
		this.click(LloydsbankField.BankingOnline);
	}

	public void clickBankingOnlineOverview()throws PageException{
		this.click(LloydsbankField.BankingOnlineOverview);
	}

	public void clickRegisterForInternetBanking()throws PageException{
		this.click(LloydsbankField.RegisterForInternetBanking);
	}

	public void clickMobileBanking()throws PageException{
		this.click(LloydsbankField.MobileBanking);
	}

	public void clickInternetBankingFeatures()throws PageException{
		this.click(LloydsbankField.InternetBankingFeatures);
	}

	public void clickImprovingInternetBanking()throws PageException{
		this.click(LloydsbankField.ImprovingInternetBanking);
	}

	public void clickOpenBanking()throws PageException{
		this.click(LloydsbankField.OpenBanking);
	}

	public void clickPlannedUpdates()throws PageException{
		this.click(LloydsbankField.PlannedUpdates);
	}

	public void clickInsideContentAreaUseArrowKeysOrTabToAccessContent()throws PageException{
		this.click(LloydsbankField.InsideContentAreaUseArrowKeysOrTabToAccessContent);
	}

	public void clickIDLikeToSeeMySavingsAndISAOptions()throws PageException{
		this.click(LloydsbankField.IDLikeToSeeMySavingsAndISAOptions);
	}

	public void clickAmIEligibleForACreditCard()throws PageException{
		this.click(LloydsbankField.AmIEligibleForACreditCard);
	}

	public void clickIMInterestedInAPersonalLoan()throws PageException{
		this.click(LloydsbankField.IMInterestedInAPersonalLoan);
	}

	public void clickIDLikeToCompareBankAccounts()throws PageException{
		this.click(LloydsbankField.IDLikeToCompareBankAccounts);
	}

	public void clickViewOurPersonalLoan()throws PageException{
		this.click(LloydsbankField.ViewOurPersonalLoan);
	}

	public void clickHowWeSupportYou()throws PageException{
		this.click(LloydsbankField.HowWeSupportYou);
	}

	public void clickCarouselPanel1()throws PageException{
		this.click(LloydsbankField.CarouselPanel1);
	}

	public void clickCarouselPanel2()throws PageException{
		this.click(LloydsbankField.CarouselPanel2);
	}

	public void clickMotorInsurance()throws PageException{
		this.click(LloydsbankField.MotorInsurance);
	}

	public void clickLostOrStolenCards()throws PageException{
		this.click(LloydsbankField.LostOrStolenCards);
	}

	public void clickFindABranch()throws PageException{
		this.click(LloydsbankField.FindABranch);
	}

	public void clickTroubleLoggingOn()throws PageException{
		this.click(LloydsbankField.TroubleLoggingOn);
	}

	public void clickHelpWithBereavement()throws PageException{
		this.click(LloydsbankField.HelpWithBereavement);
	}

	public void clickPPIComplaints()throws PageException{
		this.click(LloydsbankField.PPIComplaints);
	}

	public void clickKeepYourselfSecure()throws PageException{
		this.click(LloydsbankField.KeepYourselfSecure);
	}

	public void clickLogOnToInternetBanking()throws PageException{
		this.click(LloydsbankField.LogOnToInternetBanking);
	}

	public void clickForgottenYourLogOnDetails()throws PageException{
		this.click(LloydsbankField.ForgottenYourLogOnDetails);
	}

	public void clickOnlineHelp()throws PageException{
		this.click(LloydsbankField.OnlineHelp);
	}

	public void clickSelfService()throws PageException{
		this.click(LloydsbankField.SelfService);
	}

	public void clickHaveAnAccountWithUs()throws PageException{
		this.click(LloydsbankField.HaveAnAccountWithUs);
	}

	public void clickAboutInternetBanking()throws PageException{
		this.click(LloydsbankField.AboutInternetBanking);
	}

	public void clickHelpWithOnlineStatements()throws PageException{
		this.click(LloydsbankField.HelpWithOnlineStatements);
	}

	public void clickViewTheNewDescriptions()throws PageException{
		this.click(LloydsbankField.ViewTheNewDescriptions);
	}

	public void clickOrderTravelMoney()throws PageException{
		this.click(LloydsbankField.OrderTravelMoney);
	}

	public void clickFindOutMore()throws PageException{
		this.click(LloydsbankField.FindOutMore);
	}

	public void clickSupportingCustomersBusinessesAndCommunitiesFor250Years()throws PageException{
		this.click(LloydsbankField.SupportingCustomersBusinessesAndCommunitiesFor250Years);
	}

	public void clickLloydsBankConsumerDigitalIndexLaunches()throws PageException{
		this.click(LloydsbankField.LloydsBankConsumerDigitalIndexLaunches);
	}

	public void clickRingFencingAndLloydsBank()throws PageException{
		this.click(LloydsbankField.RingFencingAndLloydsBank);
	}

	public void clickInternetBanking()throws PageException{
		this.click(LloydsbankField.InternetBanking);
	}

	public void clickPhoneBank()throws PageException{
		this.click(LloydsbankField.PhoneBank);
	}

	public void clickX()throws PageException{
		this.click(LloydsbankField.X);
	}

	public void clickManageConsents()throws PageException{
		this.click(LloydsbankField.ManageConsents);
	}

	public void clickNavSearchButton()throws PageException{
		this.click(LloydsbankField.NavSearchButton);
	}

	public void clickSiteNavigation()throws PageException{
		this.click(LloydsbankField.SiteNavigation);
	}

	public void clickSkipContent1()throws PageException{
		this.click(LloydsbankField.SkipContent1);
	}

	public void clickSkipFooter1()throws PageException{
		this.click(LloydsbankField.SkipFooter1);
	}

	public void clickCookieCloser()throws PageException{
		this.click(LloydsbankField.CookieCloser);
	}

	public void clickMoreInformation()throws PageException{
		this.click(LloydsbankField.MoreInformation);
	}

}
