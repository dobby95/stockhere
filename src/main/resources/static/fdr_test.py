import FinanceDataReader as fdr

# 기업 정보 불러오기
def getCor(a):
    df = fdr.DataReader(a)
    return df

# 코스피 상장 리스트
def getKospi():
    stocks = fdr.StockListing('KOSPI')
    return stocks