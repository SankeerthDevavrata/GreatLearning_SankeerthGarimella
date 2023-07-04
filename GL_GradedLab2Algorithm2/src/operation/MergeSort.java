package operation;

public class MergeSort {
	
	public static void mergeSort(int arr[],int l,int r,int s){
		if(l<r) {
			int mid=(l+r)/2;
			mergeSort(arr,l,mid,s);
			mergeSort(arr,mid+1,r,s);
			Merge(arr,l,mid,r,s);
		}
	}
	
	public static void Merge(int arr[],int l,int mid,int r,int s) {
		int i=l,j=mid+1,k=l;
		int b[] =new int[s];;
		while(i<=mid && j<=r) {
			if(arr[i]>arr[j]) {
				b[k]=arr[i];
				k++;
				i++;
			}else {
				b[k]=arr[j];
				k++;
				j++;
			}
		}
		for(;i<=mid;i++) {
			b[k]=arr[i];
			k++;
		}
		for(;j<=r;j++) {
			b[k]=arr[j];
			k++;
		}
		for(i=l;i<=r;i++) {
			arr[i]=b[i];
		}
	}

}
